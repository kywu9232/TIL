package chap12;


public class RunnableTest3 {
	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			String name;
			public void run () {
				for(int i  = 1; i <=10; i++) {
					System.out.println(name + "스레드 = " + i);
				}
			}
		};
		
		
		
		//B a1 = new B("one");		
		Thread ta1 = new Thread(r1);				
		ta1.start(); //run()호출하는 시점에서 cpu 실행중인 메소드 main 실행 대기
		System.out.println("main종료");
	
		}
}
