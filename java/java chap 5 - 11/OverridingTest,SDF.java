package chap10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OverridingTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
			        
	    MySum ms1 = new MySum(i, j);
	    MySum ms2 = new MySum(j, i);

	        
	    System.out.println(ms1);//30
	    System.out.println(ms2);//30
		
	    if(ms1.equals(ms2)) {
	    System.out.println("ms1과 ms2의 합계는 동일합니다.");
		}

		String s1 = new String("30");
	    if(ms1.equals(s1)) {
	    System.out.println("ms1과 s1은  동일합니다.");
		}

		System.out.println("ms1 객체를 출력한 시각은 " + ms1.createTime() + " 입니다.");

	}

}


class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }  
    String sum = Integer.toString(first+second);
    public String toString() {
    	return Integer.toString(first+second);
    }
	public boolean equals(Object obj) {
		if(obj instanceof MySum) {
			return sum.equals(((MySum)obj).sum);
		}
		else return false;
		
	}
	
	String createTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		Date now = new Date();
		String sdfnow = sdf.format(now);
		return sdfnow;


		
		
		
	
	}
    
    }


    /* 조건2 - equals  */

   /* 조건3 - createTime */


