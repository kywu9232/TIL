package chap9;
class A{
	int v = 10;
	B b1 = new B(); 
	class B{
		int x = 20;
		void bmethod() {
			System.out.println(x);
			System.out.println("v=" + v); // 외부클래스 선언 멤버변수 사용 가능
		}
	}
	static class C{
		int y = 30;
		void cmethod() {
			System.out.println(y);
		}
	}
	void amethod () {
		B b2 = new B();
		System.out.println(b2.x);
		
	}
}


public class NestedTest {

	public static void main(String[] args) {
		A a2 = new A();
		a2.amethod();
		
		A a1 = new A();
		System.out.println(a1.b1.x);
		a1.b1.bmethod();
		
		A.B b2 = a1.new B();
		System.out.println(b2.x);
		b2.bmethod();
		
		A.C c2 = new A.C();
		
		

	}

}
