package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFinal2 {

	public static void main(String[] args) throws IOException {
		//쇼핑몰 메뉴
		//반복문 5번 입력하면 종료
		// 계속 1-4번 메뉴 보여주고 선택
		FileReader fr ;
		FileWriter fw ;
		
		
		String outputfile ="user.txt";
			
		Scanner scan = new Scanner(System.in);		
		fw = new FileWriter(outputfile,true);
		
		
		
		while(true) {
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("3. 장바구니 ");
		System.out.println("4. 쇼핑 ");
		System.out.println("5. 종료 ");
		System.out.print("원하는 작업의 번호를 입력하세요 : ");
		
		int menu = scan.nextInt();
		if(menu == 5) {
			break;
		} else if(menu == 1) {	
			String id = null;
			String pw = null;
			System.out.println("회원가입 화면으로 이동합니다");
			System.out.println("아이디 : ");
			id = scan.next();
			System.out.println("암호 : ");
			pw = scan.next();
			fw.write(id +" " + pw +  '\n');				
					
		}
		
		else if(menu == 2) {
			System.out.println("로그인 화면으로 이동합니다");
			System.out.println("로그인아이디 : ");
			String loginid = scan.next();
			System.out.println("로그인암호 : ");
			String loginpw = scan.next();
			
			fr = new FileReader("user.txt");											
			Scanner sfr  = new Scanner(fr);
			boolean exists = false;
			
			while(sfr.hasNextLine()) {					
				String user = sfr.nextLine();
				if (user.equals(loginid + " " + loginpw)) {
					System.out.println("정상적으로 로그인 되셨습니다" + loginid +" 회원님");
					exists = true;
					break;
					}						
				}
			if(exists == false) {
				System.out.println("아이디 혹은 비밀번호를 확인하세요");
			}
			sfr.close();
			fr.close();
				
		}
		else if(menu == 3) {
			System.out.println("장바구니");
		}else if(menu == 4) {
			System.out.println("상품 리스트를 보여드립니다");
		}
		}
		
		fw.close();	//while end
	}//main

}
