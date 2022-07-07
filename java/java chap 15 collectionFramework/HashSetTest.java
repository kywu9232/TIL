package chap15;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet();
		System.out.println("셋 데이터 존재하지 않는지의 여부= " + set.isEmpty());
		set.add(100);
		set.add((int)3.14);
		//set.add("settest");
		set.add(new Employee(100,"이사원",56000.11).id);
		set.add(100);//무시
		boolean b = set.remove(100);
		System.out.println(b);
		System.out.println("100 존재하는지의 여부= " + set.contains(100));
		System.out.println(set.size());
		//set 내부 보든 데이터 조회
		Iterator it = set.iterator(); // 반복자
		//set 내부 데이터 객체 저장
		while(it.hasNext()) { // 다음 데이터 존재하는지
			System.out.println(it.next()); 
		}
		for(Object o : set) {
			System.out.println(o);
		}
		
		

	}

}
