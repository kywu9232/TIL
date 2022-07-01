package chap5;

class Parent{
	int su = 10;
	void pr() {
		System.out.println(su);
	}
	void pmethod() {
		System.out.println("Parent 클래스");
	}
}

class Child1 extends Parent{
	int su = 20;
	void pr () {
		System.out.println(su);//20 오버라이딩
	}
	void cmethod() {
		System.out.println("Child1 클래스");
	}
}
public class CastingTest {
	public static void main(String[] args) {
		Parent p = new Parent();  // 자동형변환 가능	
		System.out.println(p.su); // 상위클래스 포함 변수
		p.pr();
		p.pmethod();
		
		Child1 c = new Child1();  // 자동형변환 가능	
		System.out.println(c.su); // 상위클래스 포함 변수
		c.pr();
		c.pmethod();
		c.cmethod(); //상위클래스에 포함되어 있으므로 ok
		
		Parent p2 = new Child1();  // 자동형변환 가능	
		System.out.println(p2.su); // 상위클래스 포함 변수
		p2.pr();  
		p2.pmethod();// 오버라이딩 메소드 하위클래스 포함
		//p2.cmethod(); //메모리에 존재하나 하위클래스 객체영역에 포함됨
		Child1 c2 = (Child1)p2; //명시적 형변환(용도 - 원래 하위객체 포함 변수나 메소드 사용)
		c2.cmethod();
		
		((Child1)p2).cmethod();
		
		
	}
}
