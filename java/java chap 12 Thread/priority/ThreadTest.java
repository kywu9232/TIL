package priority;


class A extends Thread{
	A(String name){
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " 의 우선순위= " + getPriority());
		for(int i = 1; i<=100; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " 스레드 = " + i );
		}
	}
}

public class ThreadTest {
	
	public static void main(String[] args) {
		A a1 = new A("one");
		A a2 = new A("two");
		a1.setPriority(Thread.MIN_PRIORITY);
		a2.setPriority(Thread.MAX_PRIORITY);
		a2.start();
		a1.start(); //run()호출하는 시점에서 cpu 실행중인 메소드 main 실행 대기
		System.out.println("main종료");
	}

}
