package client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {

	public static void main(String[] args) {
				
		try {
			Socket s = new Socket("116.125.189.194",30000);
			System.out.println("==서버 접속==");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디 : ");
			String id = scan.nextLine();
			System.out.println("비밀번호 : ");
			String pw = scan.next();	
			
			OutputStream o = s.getOutputStream();
			o.write((id+ ","+ pw + "\n").getBytes());
			
			scan.close();
							
			scan = new Scanner(s.getInputStream());
			String fromServer = scan.nextLine();
			System.out.println(fromServer);
			
			s.close();
			System.out.println("==접속 해제==");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
