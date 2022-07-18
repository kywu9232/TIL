package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			//member 테이블에서 회원정보 수정
			//아이디 입력 - 이름 폰번호 이메일만 수정
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("수정할 이름 : ");
			String name = sc.next();
			System.out.print("수정할 폰번호 : ");
			String phone = sc.next();
			System.out.print("수정할 이메일 : ");
			String email = sc.next();
			String query = "update member"
					+ " set name = '"+name+"', phone = '"+phone+"', email = '"+email+"'"
					+ " where id = '"+id+"'";
			
			Statement st = con.createStatement();
			int rowcount = st.executeUpdate(query); // 변화 행의 갯수
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
