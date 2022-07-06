class Data{
	int value;
	//동기화 메소드 정의. 2개 이상 스레드 동시 동기화 메소드 수행x 1개 수행 1개 대기
	//속도 느려짐
	public synchronized void saveValue(int value) {
		this.value = value;
		try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ ":" +this.value);
	}
}

class DataThread1 extends Thread{
	Data d;
	DataThread1(String name, Data d){
		super(name);
		this.d = d;
	}
	public void run() {
		d.saveValue(10);
	}
}

class DataThread2 extends Thread{
	Data d;
	DataThread2(String name, Data d){
		super(name);
		this.d = d;
	}
	public void run() {
		d.saveValue(20);
	}
}

public class SynchronizedTest {

	public static void main(String[] args) {
		Data d = new Data();
		DataThread1 t1 = new DataThread1("스레드1", d);
		DataThread2 t2 = new DataThread2("스레드2", d);
		t1.start();
		t2.start();


		}

	}


