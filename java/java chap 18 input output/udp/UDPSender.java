package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSender {

	public static void main(String[] args) {
		try {
		DatagramSocket sender = new DatagramSocket(); //보내는 컴퓨터 os 랜덤포트 지정
		System.out.println("==발신 시작==");
		
		String message = "폭염에 조심하세요";
		byte[] message_byte = message.getBytes();
		DatagramPacket pack = new DatagramPacket(message_byte, message_byte.length,
				new InetSocketAddress("116.125.189.194",15000));
		sender.send(pack);
		System.out.println("==발신 종료==");
		sender.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
