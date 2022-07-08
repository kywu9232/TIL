package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFinal {

	public static void main(String[] args) {
		//쇼핑몰 메뉴
		//반복문 5번 입력하면 종료
		// 계속 1-4번 메뉴 보여주고 선택
		FileReader fr = null;
		FileWriter fw = null;
		
		String inputfile ="user.txt";
		String outputfile ="user.txt";
			
		Scanner scan = new Scanner(System.in);
	
		String id = null;
		String pw = null;
		
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
			System.out.println("회원가입 화면으로 이동합니다");
			System.out.println("아이디 : ");
			id = scan.next();
			System.out.println("암호 : ");
			pw = scan.next();
						
			try {					
				fw = new FileWriter(outputfile,true);
				fw.write(id +" " + pw +  '\n');				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {					
					fw.close();
			}catch(IOException e) {}				
			}
		}
		
		else if(menu == 2) {
			System.out.println("로그인 화면으로 이동합니다");
			System.out.println("로그인아이디 : ");
			id = scan.next();
			System.out.println("로그인암호 : ");
			pw = scan.next();
			
			try {				
				
				fr = new FileReader(inputfile);
				fw = new FileWriter(outputfile,true);
				scan = new Scanner(fr);
				while(scan.hasNextLine()) {
					String userid = id + " " + pw;
					String result = scan.nextLine();
					if (userid.equals(result)) {
						System.out.println("정상적으로 로그인 되셨습니다");
						break;
						}
					else {
						System.out.println("아이디 혹은 비밀번호를 확인하세요");
						break; 
					}				
					}				
				
			fr.close();
			fw.close();
			scan.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		
			/*키보드로
			 * 로그인아이디 : idtest1
			 * 로그인암호 : pwtest1
			 * 
			 * 현재작업디렉토리user.txt 파일에서 각 줄마다 조사
			 * idtest pwtest 조회
			 * 로그인아이디와 로그인암호 일치하는 줄이 있으면 "정상적으로 로그인되셨습니다 xxxx 회원님"
				로그인아이디와 로그인암호 일치하는 줄이 없으면 "회원 가입부터 하세요"
			 * 
			 * 
			 * */	
		}
		/*else if(menu == 3) {
			System.out.println("장바구니");
		}else if(menu == 4) {
			System.out.println("상품 리스트를 보여드립니다");
		}*/
		}//while end
	}//main

}
