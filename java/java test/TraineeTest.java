class Trainee{
    String name;
	static String sosok = "멀티캠퍼스";
	String title;
	int fee;
	//final int addFee = 5000;
	final int addFee ; //부가금 자동 0 초기화
	int returnFee;
	public Trainee(String name, String title, String fee, String addFee) {
		this.name = name;
		this.title = title.toUperacase();
		this.fee = Integer.parseInt(fee);
		this.addFee = Integer.parseInt(addFee);
	}
}

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee student = new Trainee(args[0], args[1], args[2], args[3]);
	
		student.name = args[0];
		student.title= args[1].toUpperCase();// jdbc...
		student.fee = Integer.parseInt(args[2]);
		student.addFee = Integer.parseInt(args[3]);


			if(student.title.equals("자바프로그래밍")) {
			student.returnFee = (int)(student.fee * 0.25 + student.addFee);
			}
			else if(student.title.equals("JDBC프로그래밍")) {
				student.returnFee = (int)(student.fee * 0.2 + student.addFee);
			}
			else if(student.title.equals("JSP프로그래밍")) {
				student.returnFee = (int)(student.fee * 0.15 + student.addFee);
			}
			else {
				System.out.println("잘못 입력되었습니다");
				return;
			}	
			
			System.out.println("교육생이름=" + student.name);
			System.out.println("소속=" + Trainee.sosok);
			System.out.println("과정명=" + student.title);
			System.out.println("교육비=" + student.fee);
			System.out.println("부가금=" + student.addFee);
			System.out.println("환급금=" + student.returnFee);
	}//main


}
