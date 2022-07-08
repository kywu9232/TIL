package chap18;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2개의 정수를 입력하면 덧셈 결과 출력");
		int first = scan.nextInt();
		int second = scan.nextInt();
		System.out.println("덧셈 결과 = " + (first + second));
		System.out.println("한글 데이터 입력시 한글 출력");
		scan.nextLine();
		String third = scan.nextLine();
		System.out.println(third);
	}
}
