package chap10;

public class StringClassTest {

	public static void main(String[] args) {
		char c[] = new char[100];
		int index = 0;
		try {
			while(true) {
				int result = System.in.read();
				if(result == '\n') {break;} // 엔터 나오기 전까지 
				c[index++] = (char)result;
				
			}
			String sc = new String(c);
			System.out.println(sc.toUpperCase());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
