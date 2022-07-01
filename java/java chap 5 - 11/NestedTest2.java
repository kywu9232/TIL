package chap91;



class A {
	interface I{
	void m1();
	void m2();
	}
	I i1 = new I() { // 인터페이스 I 상속 익명클래스 정의 동시에 객체생성, 안드로이드 앱에서 많이 쓰임
		public void m1() {System.out.println("m1");}
		public void m2() {System.out.println("m2");}
	};
}

public class NestedTest2 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.i1.m1();
		a1.i1.m2();
		

	}

}
