package chap10;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		try{
			while(true) {
				//영문, 숫자, 키보드 특수문자들 여러개 o, 한글 완성값 x, 정수 실수 입력 x
			int result = System.in.read(); //키보드 1개값 입력
			if(result == '\n') {break;}
			System.out.println((char)result);
		}
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
