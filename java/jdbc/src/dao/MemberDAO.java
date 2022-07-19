package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dto.MemberDTO;

public class MemberDAO {	
		public int insertMember(MemberDTO dto) {
			int result = 0;
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("드라이버 호출 완료");
				con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
				System.out.println("연결 성공");
				String sql = "insert into member values(?,?,?,?,?,now())";
				PreparedStatement pt = con.prepareStatement(sql);
				
				pt.setString(1, dto.getId());
				pt.setInt(2, dto.getPassword());
				pt.setString(3, dto.getName());
				pt.setString(4, dto.getPhone());
				pt.setString(5, dto.getEmail());
				
				result = pt.executeUpdate();
				System.out.println("(insertMember내부)삽입행 갯수" + result);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				con.close();
				}catch(SQLException e) {}
				
			}
			return result;			
		}
		
		public int updateMember(MemberDTO dto) {
			int result = 0;
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");				
				con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");

				
				String colName = "";
				String colValue = "";
				if(dto.getPassword() != 0) {
					colName = "password";
					colValue = String.valueOf(dto.getPassword());
				}
				else if(dto.getName() != null) {
					colName = "name";
					colValue = dto.getName();
				}
				else if(dto.getPhone() != null) {
					colName = "name";
					colValue = dto.getPhone();
				}	
				else if(dto.getEmail() != null) {
					colName = "name";
					colValue = dto.getEmail();
				}
				String sql = "update member set " + colName + "=?  where id =?";
				PreparedStatement pt = con.prepareStatement(sql);
				pt.setString(1, colValue);
				pt.setString(2, dto.getId());
				result = pt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				con.close();
				}catch(SQLException e) {}
				
			}
			return result;
			
		}//updateemp
	
		public int deleteMember(String id,String password) {
			int result = 0;
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");				
				con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
				
				String sql1 = "select password from member where id =?";
				PreparedStatement pt1 = con.prepareStatement(sql1);
				pt1.setString(1, id);
				pt1.executeQuery();
				ResultSet rs = pt1.executeQuery();
				
				boolean isPW = false;
				while(rs.next()) {
					if(password.equals(rs.getString("password"))) {
						String sql2 = "delete from member where id =? and password=? ";
						PreparedStatement pt2 = con.prepareStatement(sql2);
						pt2.setString(1, id);
						pt2.setString(2, password);
						result = pt2.executeUpdate();
						isPW = true;
					}					
				}

			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				con.close();
				}catch(SQLException e) {}
				
			}
			return result;
			
		}//updateemp
	
		public int selectMember(String id,String password) {
			int result = 0;
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");				
				con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
				
				String sql1 = "select password from member where id =?";
				PreparedStatement pt1 = con.prepareStatement(sql1);
				pt1.setString(1, id);
				pt1.executeQuery();
				ResultSet rs = pt1.executeQuery();
				
				while(rs.next()) {
					if(id.equals(rs.getString("id"))) {
					
						if(password.equals(rs.getString("password"))) {
							String sql2 = "select from member where id =? and password=? ";
							PreparedStatement pt2 = con.prepareStatement(sql2);
							pt2.setString(1, id);
							pt2.setString(2, password);
							
							result = 2;										
						}
						else {result = 1;}
					}
					else { result = 0;}
				}
				

			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				con.close();
				}catch(SQLException e) {}
				
			}
			return result;
			
		}//updateemp
	
		
}
