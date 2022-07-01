package chap5;
//super  - 상위클래스 타입 "객체" 의미 자바 키워드
//인터페이스 객체 생성 불가능
class StudentWorker implements Student,Worker{ //조교(학생+교직원)
	String name = "조교";
	public void study() {
		
		System.out.println("조교는 오전에 공부하다");
	}
	public void work() {
		System.out.println("조교는 오후에 행정업무하다");
	}
	public void lunch() {
		System.out.println("조교는 점심먹다");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		
		Student sw2 = new StudentWorker();
		sw2.study();
		sw2.lunch();
		
		Worker sw3 = new StudentWorker();
		sw3.lunch();
		sw3.work();
	

	}

}
