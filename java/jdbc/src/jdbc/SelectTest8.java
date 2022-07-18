package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest8 {
	public String test(String inputmonth) {
		Connection con = null;
		String result = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/empdb","emp2","1234");
			System.out.println("연결 성공");

			String sql = "select month(hire_date) ,sum(e.salary) from employees e"
					+ " where date_format(hire_date,'%m') != "+ inputmonth	
					+ " group by month(hire_date)"
					+ " order by month(hire_date) asc";
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(sql);
			
			while(rs.next()) { // 열어주고 1번레코드 이동 t/f 리턴				
				result += rs.getString(1) + "월 " + rs.getInt(2) + "\n";
				}
		
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
		return result;
	}

	public static void main(String[] args) {
		SelectTest8 s = new SelectTest8();
		Scanner scan = new Scanner(System.in);
		System.out.println("제외할 월 : ");
		String month = scan.next();
		String output = s.test(month);
		System.out.println(output);
		
	}


}
