@FunctionalInterface //@annotation 컴파일러 알려주는 설명
interface I1{
	void m1();
}
interface I2{
	void m1(int x);
}
interface I3{
	void m1(int x, int y);
}
interface I4{
	int m1(int i, int j);
}

//1개 메소드만 정의 인터페이스 일 때 = functional interface = 람다식 구현
public class Lambda {

	public static void main(String[] args) {
		// {} 내부 1문장 생략, 2문장 이상시 필수
		I1 i1 = () -> System.out.println("람다테스트");
		i1.m1();
		
		I2 i2 = x-> System.out.println(x);
		i2.m1(10);
		
		I3 i3 = (x, y) -> {System.out.println(x+y);System.out.println(x*y);};
		i3.m1(5, 8);
		
		//리턴 타입 있는 메소드는 {.. return xx;}
		I4 i4 = (i,j) -> i+j;
		int result = i4.m1(10, 20);
		System.out.println(result);
		
	}

}
