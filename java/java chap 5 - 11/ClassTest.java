package chap10;

public class ClassTest {

	public static void main(String[] args) {
		//args[0] 입력 클래스명의 객체 생성 - 객체 동적으로 달라짐
		//클래스 존재하지 않을 수도 있다
		try {
		Class c = Class.forName(args[0]);
		Object o = c.newInstance();
		System.out.println(o.getClass().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
