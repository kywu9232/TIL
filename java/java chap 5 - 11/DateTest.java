package chap10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		long mill = System.currentTimeMillis();
		
		Date now = new Date();
		Date now2 = new Date(mill);
		
		System.out.println(now);
		System.out.println(now2);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//now.getYear();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // month는 배열처럼 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		cal.get(Calendar.DAY_OF_WEEK); // 
		
		System.out.println("현재시각은" + year + "년도 " + month + " 월 " + day + " 일 ");
		System.out.println(hour + " 시 " + min + " 분 " + sec + "초입니다" );
		
		if(cal.get(Calendar.DAY_OF_WEEK)==2) {
			System.out.println("월요일 - monday");
		}
		//SimpleDateFormat - 간결 날짜 시각 형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E"); //d - 이달중 몇일, d - 1년중 몇일
		//hh - 12시간 HH - 24시간 mm - 분 a-오전 오후 , E - 요일
		String result = sdf.format(cal.getTime());
		System.out.println(result);
	}
	// Date 클래스의 메소드들은 jdk 변화되면서 사용 자제 표시 - deprecated method
	//사용해도 컴파일 오류는 발생하지 않음
	//

}
