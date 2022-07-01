package chap10;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test{
	void m1 (int i) throws ArithmeticException{ //예외처리권한 포기
		System.out.println(100/i);
	}
	void m2() {
		try {
		m1(0);	
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}		
	}
	void m3 () {
		try {
		m1(0);
		}
		catch(ArithmeticException e) {
			m1(100);
		}		
	}
	void m4 () {
		try {
		FileReader fr = new FileReader("a.txt");
		FileReader fr2 = new FileReader("a.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
public class ThrowsTest {

	public static void main(String[] args) {
		Test t1 = new Test();		
		t1.m2();
		t1.m3();
		t1.m4();
		
	
	}
}
