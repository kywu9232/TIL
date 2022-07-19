package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			String sql = "insert into member valuees(?,?,?,?,?,now())";
			PreparedStatement pt = con.prepareStatement(sql);
			
			pt.setString(1, "id_jdbc2");
			pt.setInt(2, 2222);
			pt.setString(3, "김강산");
			pt.setString(4, "010-4312-4321");
			pt.setString(5, "kang@tech.com");
			
			int rows = pt.executeUpdate();
			System.out.println("삽입god 갯수" + rows);
			
			
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
