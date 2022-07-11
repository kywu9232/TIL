package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest {

	public static void main(String[] args) {
		try {
		//1. 서버시작
		ServerSocket ss = new ServerSocket(10000);// 이미 실행중. 10000번 포트 실행 불가
		System.out.println("==서버는 10000번 포트에서 동작중입니다=="); 
		while(true){
		//2. 클라이언트 접속 대기4. 클라이언트의 접속 허용
			Socket s = ss.accept();
			System.out.println("==" + s.getInetAddress().getHostAddress()+"클라이언트와 연결되었습니다");
		//6. 클라이언트 요청 분석 – 적당 응답 전달
			for(int index=1; index <=3; index++) {
			InputStream i = s.getInputStream();
			Scanner si = new Scanner(i);
			int fromClient = si.nextInt();
			//while(si.hasNextLine()) {
			//String fromClient = si.nextLine();
			System.out.println(++fromClient);
		//	}
			//클라이언트로 응답
			String reply = "네 안녕합니다. 잘 지내시죠\n";
			OutputStream o = s.getOutputStream();
			o.write(reply.getBytes());
			}
		//8. 클라이언트 접속 해제
		
			s.close();
			System.out.println("==" + s.getInetAddress().getHostAddress()+"클라이언트와 해제되었습니다");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//9. 서버 종료


	}

}
