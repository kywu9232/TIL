package chap5;

class Employee {
	int id;
	String name = "회사원";
	double pay;
	void printInform() {
		System.out.println(id + " :" + name +" :" + pay);
	}
}

class Manager extends Employee{
	String jopOfManage;
	String name = "관리직";
	void test() {
		String name = "지역변수";
		System.out.println(name); //지역변수
		System.out.println(this.name);//현재멤버변수
		System.out.println(super.name);//상속멤버변수
	}
	// printInform Employee 정의 내용을 manager에서 재정의
	@Override //at sign (컴파일러에게 설명, 실행영향 o) // 주석문 (사람에게 설명 실행 영향x)
	public void printInform() {
		//System.out.println(id + " :" + name +" :" + pay);
		super.printInform();
		System.out.println(jopOfManage);
	}
	
}

public class ManagerTest {

	public static void main(String[] args) {
		Manager m  = new Manager();
		m.id = 200;
		//m.name = "홍길동";
		m.pay = 34500.99;
		m.jopOfManage = "it관리";
		System.out.println("사번=" +  m.id);
		System.out.println("이름=" +  m.name);
		System.out.println("급여=" +  m.pay);
		System.out.println("관리업무=" +  m.jopOfManage);
		m.printInform();
		m.test();
		
		
		

	}

}
