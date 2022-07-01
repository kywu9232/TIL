package chap10;

public class ExceptionTest {

	public static void main(String[] args) {
		int j = 0;
		try {
		int i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		System.out.println(i/j);
		}
		catch (ArithmeticException e) {
			//j=100;
			System.out.println("0은 입력하지 마세요");
		}
		catch(Exception e) { //상위 예외
			System.out.println("모든종류 예외 처리");
		}
		finally {
			System.out.println("항상출력");
		}
		
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2개 이상의 값을 입력하세요");
		}
		catch(NumberFormatException e) {
			System.out.println("정수 변환 값을 입력하세요");
		}*/
		
		System.out.println("메인완료");
		
	}

}
