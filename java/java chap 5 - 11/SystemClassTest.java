package chap10;

public class SystemClassTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println("최초시각(1/1000초 단위)= " + System.currentTimeMillis());
		System.out.println("자바 버전 " + System.getProperty("java.version"));
		System.out.println("os " + System.getProperty("os.name"));
		System.out.println("자바 저장 디렉토리 " + System.getProperty("user.dir"));
		System.out.println("파일 관리자" + System.getProperty("file.separator"));

		if (true) {
			System.exit(0);
			for (int i = 1; 1 <= 10000; i++) {
				System.out.println(i);
			}
		}
		System.out.println("종료시각(1/1000초 단위)= " + (System.currentTimeMillis() - start));

	}

}
