package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			//member 테이블에서 회원정보 수정
			//아이디 입력 - 이름 폰번호 이메일만 수정
			
			
			Statement st = con.createStatement();
			int rowcount = st.executeUpdate(
					/*"create table test(a int, b varchar(10))"
					"insert into test values(1,'java')"
					"delete from test where a=1"*/ // table 구조는 남아있음
					"drop table test" // 레코드와 테이블도 삭제
					);
			System.out.println("수정된 행의 갯수=" + rowcount);
		} catch (ClassNotFoundException e) {
			System.out.println("미설치 혹은 classpath 미등록 또는 드라이버명 오타 확인");
		}catch(SQLException e) {
			System.out.println("db연결 정보 오류");
		}finally {
			try {
			con.close();
			System.out.println("연결 해제 성공");	
			}catch(SQLException e) {}
		}
		

	}


}
