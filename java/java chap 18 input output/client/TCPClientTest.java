package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) {
		try {
		// 서버로 접속
		Socket s = new Socket("116.125.189.194",0000);		
		System.out.println("==" + s.getInetAddress().getHostAddress()+"서버와 연결되었습니다");
		//5. 회원가입, 로그인, 쇼핑, 게시판 요청 전달
		for(int index = 1; index<=3; index++) {
		String message = "100\n";
		byte[] message_byte = message.getBytes();
		
		OutputStream o = s.getOutputStream(); // 클라이언트는 출력 (서버는 입력)
		o.write(message_byte);
		
		System.out.println(message_byte.length);
		System.out.println("==" + message + "인사말을 서버로 전송했습니다. ==");
		//서버 응답 대기
		InputStream i = s.getInputStream();
		Scanner si = new Scanner(i);
		String fromServer = si.nextLine();
		System.out.println(fromServer);
		}
		//7. 서버 접속 해제
		s.close();
		System.out.println("==" + s.getInetAddress().getHostAddress()+"서버와 연결되었습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
