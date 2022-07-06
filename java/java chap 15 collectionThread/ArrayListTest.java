package chap15;

import java.util.ArrayList;
class Employee{
	int id;
	String name;
	double pay;
	Employee(int id, String name, double pay){
		this.id = id;
		this.name = name ;
		this.pay = pay;
	}
	@Override
	public String toString() {
		return id + "-" + name + "-" + pay;
	}
}

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("jsp");
		list.add(true);
		list.add('a');
		Employee e1 = new Employee(100, "김사원", 67000.88);
		list.add(e1);
		Employee e2 = new Employee(200, "최사원", 77000.88);
		list.add(e2);
		Employee e3 = new Employee(300, "최사원", 87000.88);
		list.add(e3);
		
		System.out.println(list.size());
		for(int i = 0; i<list.size();i++) {// 저장된 갯수 만큼 반복
			System.out.println(i + "위치의 값 = " + list.get(i));
		}
	}

}
