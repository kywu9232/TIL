package server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LoginServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(30000);
		System.out.println("==서버 동작==");
		while(true) {
			Socket s = ss.accept();
								
			OutputStream o = s.getOutputStream();
				
			Scanner input = new Scanner(s.getInputStream());							
			String fromClient = input.nextLine();
			System.out.println(fromClient);
			String[] id_pw = fromClient.split(",");
			String id = id_pw[0];
			String pw = id_pw[1];
			
			HashMap<String,String> users = new HashMap<String, String>();
			users.put("multi","campus");
			users.put("java","program");
			users.put("oracle","db");
			
			Set<String> ids = users.keySet();
			boolean exists = false;
			for(String i : ids) {
				if(id.equals(i)) { //아이디 존재 확인
					exists = true;
					String v = users.get(i); //해당 아이디의 암호 얻어옴
					if(pw.equals(v)) { // 암호 확인
						o.write(("정상 로그인 사용자입니다").getBytes());
					}
					else {
						o.write(("암호가 다릅니다").getBytes());
					}
				}								
			}
			if(exists == false) {
				o.write(("아이디가 없습니다").getBytes());
			}
						
			if(id.split(",")[0].equals("quit")&&pw.split(",")[1].equals("quit")){				
				System.out.println("==서버종료==");
				ss.close();
			}
		
			s.close();				
			System.out.println("==서버종료==");
		}

	}

}
