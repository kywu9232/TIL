package chap18;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		try {
		while(true) {
		int result = System.in.read(); // 키 1개 입력 내용의 unicode 해당 숫자 리턴
		System.out.println(result + ":" + (char)result);
		
		
		if(result == 13) {// '\n' = 13
			break;
			}
		}
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}
}//자바 데이터 타입 입력 변환 기능 없다 , 한글 변환 기능 없다



