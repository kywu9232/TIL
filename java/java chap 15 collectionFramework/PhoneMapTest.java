import java.util.HashMap;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		String names[] = {"우리엄마", "내친구", "회사동료", "내동생"}; 
		String phone1[] = {"010-1234-5678", "02-111-222", "umma@multi.com"};
		String phone2[] = {"010-9876-5432", "02-123-4567", "031-3333-44444", "myfriend@multi.com"};
		String phone3[] = {"010-1212-4444", "02-6775-5656", "company@multi.com"};
		String phone4[] = {"010-1111-5678"};
		//names배열문자열 - key
		//names[0] value = phone1 배열값들
		HashMap <String,String[]> phone = new HashMap();
		
		phone.put(names[0],phone1);
		phone.put(names[1],phone2);
		phone.put(names[2],phone3);
		phone.put(names[3],phone4);
		
		Set keys = phone.keySet();
		for(Object k : keys) {
			System.out.print(k + " - ");
			String[] p =  phone.get(k);
			for(String sp : p) {
				System.out.print( sp + " , " );
			}
			System.out.println();
		}
		
		
		//phone 모든값 출력
		//우리엄마 - "010-1234-5678", "02-111-222", "umma@multi.com"
		//내친구 - "010-9876-5432", "02-123-4567", "031-3333-44444", "myfriend@multi.com"
		//....
		
		/*boolean b = phone.containsKey(args[0]);	
		if(b == true) {
			String[] result = phone.get(args[0]);
			for(String r : result) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("해당 정보는 입력된 적이 없습니다");
		}*/
		
		String [] result = phone.get(args[0]);
		if(result != null) {
			for(String r : result) {
				System.out.print(r + " ");
			}
			System.out.println();		
		}
		else {
			System.out.println("해당 정보는 입력된 적이 없습니다");
		}
	}
}
