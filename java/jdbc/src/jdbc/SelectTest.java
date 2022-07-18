package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			
			String query = "select id , password, insert(password, 1, length(password) , repeat('*', length(password))) 암호 , name, phone, email from member;";
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(query);
			while(rs.next()) { // 열어주고 1번레코드 이동 t/f 리턴
				System.out.println("-------------------------");
				System.out.println(rs.getString(1) + ":" + rs.getString("암호") + ":" + rs.getString("name") + ":" + rs.getString("phone") + ":" + rs.getString("email"));
			
		
			}
			rs.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("미설치 혹은 classpath 미등록 또는 드라이버명 오타 확인");
		}catch(SQLException e) {
			System.out.println("db연결 정보 오류");
			e.printStackTrace();
		}finally {
			try {
			con.close();
			System.out.println("연결 해제 성공");	
			}catch(SQLException e) {}
		}
		

	}


}
