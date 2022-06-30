package test1;

class Employee {
	int id;
	String name;
	int basepay;
	int benefit;
	int salary;
	
	Employee(int id, String name, int basepay, int benefit){
		this.id = id;
		this.name = name;
		this.basepay = basepay;
		this.benefit = benefit;	
		}
	
	public void eSalary () {
		salary = basepay + benefit;
	}
	
}
class Manager extends Employee{
	int mBenefit;
	public Manager(int id,String name,int basepay, int benefit, int mBenefit){	
		   super(id, name, basepay, benefit); 
		   this.mBenefit = mBenefit;
	}

	public void eSalary () {
		super.eSalary();
		salary += mBenefit;
	}
	
}

class Engineer extends Employee{
	int eBenefit;
	int qualifi;
	public Engineer(int id,String name,int basepay, int benefit, int eBenefit, int qualifi){	
		   super(id, name, basepay, benefit);
		   this.eBenefit = eBenefit;
		   this.qualifi = qualifi;
}
	public void eSalary() {
		super.eSalary();
		salary += eBenefit + qualifi;
	}
}
class Secretary extends Employee{
	int sBenefit;
	public Secretary(int id,String name,int basepay, int benefit, int sBenefit){	
		   super(id, name, basepay, benefit);
		   this.sBenefit = sBenefit;
	}
	public void eSalary() {
		super.eSalary();
		salary += sBenefit;
	}
}
public class SalaryTest {
	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		System.out.println();
		for(int i =0; i <e.length; i ++) {
			e[i].eSalary();
			System.out.println(e[i].id + " : " + e[i].name + " : " + e[i].salary );
			}
		}
	}


