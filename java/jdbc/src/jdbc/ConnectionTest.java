package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			// member 테이블에 회원가입 정보 저장
			//id_jdbc1, 1234, 김회원, 010-1234-1234, kim@mem.net, 현재시각
			/*String query = "insert into member"
					+ " values('id_jdbc1' "
					+ " , 1234, '김회원', '010-1234-1234', 'kim@mem.net', now())";*/
			/*Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("폰번호 : ");
			String phone = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			String query = "insert into member"
			+ " values('"+id + "' , " + pw + ", '" + name + "', '" + phone + "', '"+ email +"', now())";*/
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("제목 : ");
			String title = sc.nextLine();
			System.out.println("내용 : ");
			String contents = sc.nextLine();
			System.out.print("작성자 : ");
			String writer = sc.next();
			String query = "insert into c_memo(title, contents,time,writer) values('"+title+"','"+contents+"',now(),'"+writer+"')";
			
			Statement st = con.createStatement();
			int rowcount = st.executeUpdate(query);
			System.out.println("저장 행의 갯수=" + rowcount);
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
