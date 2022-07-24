package javaExam;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		
		while(true) {
			System.out.println("1. 도서정보입력");
			System.out.println("2. 조회");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력");	
			int menu = sc.nextInt();
			if(menu==0) {System.exit(0);}
			else if (menu == 1) {
				dao.input();
			}
			else if (menu == 2) {
				dao.selectBook();
			}
		}
	}

}
