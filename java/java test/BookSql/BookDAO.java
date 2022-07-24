package javaExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class BookDAO {
	public int insertBook(BookDTO dto) {
		int result = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			String sql = "insert into book values(?,?,?,?,?,?)";
			PreparedStatement pt = con.prepareStatement(sql);
			
			pt.setString(1, dto.getBookNo());
			pt.setString(2, dto.getBookTitle());
			pt.setString(3, dto.getBookAuthor());
			pt.setString(4, dto.getBookYear());
			pt.setInt(5, dto.getBookPrice());
			pt.setString(6, dto.getBookPublisher());			
			result = pt.executeUpdate();			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			}catch(SQLException e) {}
			
		}
		return result;			
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 번호 : ");
		String bookNo = sc.next();
		System.out.println("도서 제목 : ");
		String bookTitle = sc.next();
		System.out.println("저자 : ");
		String bookAuthor = sc.next();
		System.out.println("발행연도 : ");
		String bookYear = sc.next();
		System.out.println("가격 : ");
		int bookPrice = sc.nextInt();
		System.out.println("출판사 : ");
		String bookPublisher = sc.next();
		
		BookDTO dto = new BookDTO();
		dto.setBookNo(bookNo);
		dto.setBookTitle(bookTitle);
		dto.setBookAuthor(bookAuthor);
		dto.setBookYear(bookYear);
		dto.setBookPrice(bookPrice);
		dto.setBookPublisher(bookPublisher);
		
		BookDAO dao = new BookDAO();		
		int result = dao.insertBook(dto);
		System.out.println(result);
	

	}
	public void selectBook() {			
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 호출 완료");
			con = DriverManager.getConnection("jdbc:mysql://116.125.189.194:3306/memberdb","emp2","1234");
			System.out.println("연결 성공");
			
			String query = "select * from book;";
			Statement st =	con.createStatement();
			ResultSet rs = 	st.executeQuery(query);
			System.out.println("-----------------------------------------------------------");
			while(rs.next()) { 			
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t" + rs.getInt(5)+ "\t" + rs.getString(6));		
			}
			System.out.println("-----------------------------------------------------------");
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			}catch(SQLException e) {}
			
		}

	}
	
}




