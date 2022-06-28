
class Student {
	String name;
	static String def = "멀티캠퍼스";
	String subject;
	int fee;
	int penalty;
	double refund;
}

public class t0623 {
	public static void main(String[] args) {
		Student p1 = new Student();
		p1.name = args[0];
		p1.subject = args[1].toUpperCase();
		p1.fee = Integer.parseInt(args[2]);
		p1.penalty = Integer.parseInt(args[3]);

		/*
		 * if (p1.subject.contains("프로그래밍")){ if (p1.subject.equals("자바프로그래밍")){
		 * p1.refund = (p1.fee*0.25) + p1.penalty;} else if
		 * (p1.subject.equals("JDBC프로그래밍")){ p1.refund = (p1.fee*0.20) + p1.penalty;}
		 * else if(p1.subject.equals("JSP프로그래밍")){ p1.refund = (p1.fee*0.15) +
		 * p1.penalty;} System.out.println( p1.name + ", " + p1.def + ", " + p1.subject
		 * + ", " + p1.fee + ", " + p1.penalty + ", " + p1.refund ); return; } else
		 * {System.out.println("잘못 입력되었습니다");
		 */

		if (p1.subject.equals("자바프로그래밍")) {
			p1.refund = (p1.fee * 0.25) + p1.penalty;
		} else if (p1.subject.equals("JDBC프로그래밍")) {
			p1.refund = (p1.fee * 0.20) + p1.penalty;
		} else if (p1.subject.equals("JSP프로그래밍")) {
			p1.refund = (p1.fee * 0.15) + p1.penalty;
		} else {
			System.out.println("잘못 입력되었습니다");
			return;}

		System.out.println(
					p1.name + ", " + p1.def + ", " + p1.subject + ", " + p1.fee + ", " + p1.penalty + ", " + p1.refund);

		
	}
}
