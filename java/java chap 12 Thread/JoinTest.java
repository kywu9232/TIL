class C extends Thread{
	int data = 10;
	public void run() {
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			data = data * 2;
			System.out.println("run 메소드 = " + data);
		}
		
	}
}
public class JoinTest {

	public static void main(String[] args) {
		System.out.println("main시작");
		C c1 = new C();
		c1.start();
		try {
			c1.join();
		}catch(InterruptedException e) {			
		}
		System.out.println(c1.data);
		System.out.println("main종료");

	}

}
