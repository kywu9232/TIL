package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		//현재 내 컴퓨터 = 로컬호스트의 ip 정보 객체
		try {
		InetAddress ip =  InetAddress.getLocalHost();
		System.out.println("내 컴퓨터의 ip= "+ip.getHostAddress()); // ip주소값
		// 구글 ip 정보
		InetAddress[] ip2 = InetAddress.getAllByName("www.google.com");
		for(InetAddress inet : ip2) {
			System.out.println("구글 ip = " + inet.getHostAddress());
		}
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
