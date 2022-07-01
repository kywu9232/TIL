package chap10;

class CellPhone{
	String model;
	double battery;
	CellPhone(String model){
		this.model = model;
	}
	void call(int time) throws IllegalArgumentException{
		if (time <0) {
				 throw new IllegalArgumentException ("통화시간 입력 오류");			
		}
		battery -= time*0.5;
		if (battery <= 0) {
			battery = 0;
			}
		System.out.println("통화시간 : " + time + "분");		
	}
		
	void charge(int time) throws IllegalArgumentException{
		if (time < 0) {
			throw new IllegalArgumentException("충전시간 입력 오류");
		}
		battery += time * 3;
		if (battery > 100) { 
			battery = 100;
		}
		System.out.println("충전시간 : " + time + "분");		
	}
	
	void printBattery() {	
		System.out.println("현재 배터리 양 : " + battery);
	}	
	
	boolean isSame(CellPhone other) {
		return model.equalsIgnoreCase(other.model);
		
	}	
}

public class CellPhoneMain {

	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("GALAXY-7");
		
		myPhone.charge(20); //20분간 충전
		myPhone.printBattery();
		
		myPhone.call(300);
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40);
		myPhone.printBattery();
		
		try {
		myPhone.call(-20);		
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {		
			myPhone.charge(-20);
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		
			
		CellPhone yourPhone = new CellPhone("galaxy-7");	
		if(myPhone.isSame(yourPhone)) {
			System.out.println("동일 모델 입니다");
		}
		else {
			System.out.println("다른 모델 입니다");
		}
				
	}
}

