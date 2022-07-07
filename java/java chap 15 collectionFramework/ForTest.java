package chap15;

import java.util.ArrayList;

public class ForTest {

	public static void main(String[] args) {
		String [] arr = {"java", "db", "web client", "web server", "ai"};
		arr[4] = "spring";
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//jdk 1.5 개선 반복문
		System.out.println("==================");
		for( String s : arr ) {
			System.out.println(s.toUpperCase());
		}
		
		System.out.println("==================");
		
		ArrayList<String> list = new ArrayList<String>(5);
		list.add("java");
		list.add("db");
		list.add("web client");
		list.add("web server");
		list.add("ai");
		list.add("spring");
		//list.add(100);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==================");
		for( String s : list ) {
			System.out.println(s.toUpperCase());
		//	if (s instanceof String) {
			//	System.out.println(((String)s).toUpperCase());
			//}
			
		
	}
	}
}
