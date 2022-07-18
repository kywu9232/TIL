package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/empdb","emp2","1234");
			System.out.println("연결 성공");
			
			//employee 테이블에서 사번 이름 급여 입사일 조회하되 사번이 100번대 
			/*String query = "select employee_id, first_name, salary, hire_date from employees"
					+ " where employee_id like '1%' ";
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(query);
			while(rs.next()) { // 열어주고 1번레코드 이동 t/f 리턴
				System.out.println(rs.getString("employee_id") + ":" + rs.getString("first_name")  + ":" + rs.getString("salary") + ":" + rs.getString("hire_date"));*/
			
			// 급여 총합 조회
			String query = "select avg(salary) from employees";
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(query);
			rs.next(); // 열어주고 1번레코드 이동 t/f 리턴
			System.out.println(rs.getInt("avg(salary)"));
			
		
			
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
