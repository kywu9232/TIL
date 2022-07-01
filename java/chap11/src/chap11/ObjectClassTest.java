package chap11;

public class ObjectClassTest {

	public static void main(String[] args) {

		MyObject o1 = new MyObject("MyObject");
		MyObject o2 = new MyObject("MyObject");
		
		System.out.println(o1); //o1 객체생성 전달문자열 출력내용 변경 - toString 오버라이딩
		System.out.println(o2);

		if(o1==o2) {//false. 오버라이딩 불가능
			System.out.println("o1 == o2 같다");
		}
		if(o1.equals(o2)) { //false.오버라이딩가능(변경가능)
			// o2가 MyObject 타입 객체인지 체크 (타입이 다르다면 false)
			//o1 msg , o2 msg 동일하면 true 
			System.out.println("o1.equals(o2) 같다");
		}

	}
}

class MyObject{
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			return msg.equals(((MyObject)obj).msg);
		}
		else {
			return false;
		}
		
	}

}
