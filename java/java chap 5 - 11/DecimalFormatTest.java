package chap10;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		double num = 4567.84;
		//# 정수부분 - 표현 숫자가 커도 잘 표현
		//# 소수점 이하 부분 - 정확한 자리수 표현(반올림)
		DecimalFormat df = new DecimalFormat("0"); 
		System.out.println(df.format(num));
		df = new DecimalFormat("000.000"); //6자리 고정 수
		System.out.println(df.format(num));
		df = new DecimalFormat("+000000.00; -000.00000"); 
		System.out.println(df.format(num));
		df = new DecimalFormat("#.00"); 
		System.out.println(df.format(10/(double)3));
		
		
		
		
		
		
		

	}

}
