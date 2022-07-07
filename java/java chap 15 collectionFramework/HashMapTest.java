package chap15;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap<String, Employee>();
		Employee e1 = new Employee(100,"이사원",56000.77);
		
		map.put("사원1",new Employee(100,"이사원",56000.77));
		map.put("사원2",new Employee(200,"막사원",56000.77));
		map.put("사원3",new Employee(300,"김사원",56000.77));
		map.put("사원1",new Employee(400,"최사원",56000.77)); // key값 같으므로 사원1 데이터 수정
		map.put("사원4",e1); // 값 중복 허용
		System.out.println("갯수= " +  map.size());
		
		Object o = map.get("사원3");
		//if(o instanceof Employee) {
		//	System.out.println(((Employee)o).name);
		//}
		Set keys = map.keySet();
		for(Object k : keys) {
			System.out.println("키는" + k + "이고 값은 " + map.get(k));
		}

	}

}
