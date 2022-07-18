package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest6 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/empdb","emp2","1234");
			System.out.println("연결 성공");
			
			//subquery
			// create table a select * from member --> 테이블 생성 + 레코드 복사
			// insert into b (select * from member) --> 데이터 레코드 복사
			// update c set name == '이름변경' where id = (select id from member where name = '홍길동')
			
			// william 사원보다 급여를 더 많이 받는 사원의 사번 이름 급여 조회
			
			String query = "select employee_id, first_name, salary from employees "
					+ " where salary > any (select salary from employees where first_name = 'william')"; 
			// any ( subquery 레코드중 1개보다 커야함
			// all ( subquery 레코드 모두보다 커야함
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(query);
					
			int count = 0;
			while(rs.next()) { // 열어주고 1번레코드 이동 t/f 리턴
			System.out.println(rs.getString(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
			count ++;
			}
			System.out.println("총 레코드 갯수 - " + count);
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
