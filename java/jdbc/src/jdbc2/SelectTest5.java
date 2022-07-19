package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest5 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/empdb","emp2","1234");
			System.out.println("연결 성공");
			
			//80번 부서 사원이름 
			//
			String query = "select first_name, department_name, city  from employees e"
					+ " join departments d on e.department_id = d.department_id"
					+ " join locations l on d.location_id = l.location_id"
					+ " where d.department_id = ?"; // join은 기본적으로 inner join
			
			PreparedStatement st =	con.prepareStatement(query);
			st.setInt(1,80);
			ResultSet rs = 	st.executeQuery();
					
			int count = 0;
			while(rs.next()) { // 열어주고 1번레코드 이동 t/f 리턴
			System.out.println(rs.getString(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
			count ++;
			}
			System.out.println("총 레코드 갯수 - " + count);
			rs.close();
			
			Statement st2 =	con.createStatement();
			ResultSet rs2 = st2.executeQuery("select count(*) from employees");
			rs2.next();
			System.out.println((rs.getInt(1)));
			
			rs2.close();
			
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
