

public class TwoDimArray {

	public static void main(String[] args) {
		// 3명학생 2,3,4과목 점수 - 
		int array2 [][] = new int[args.length][];

		
		String names[] = new String[args.length];
		for (int student = 0; student < args.length; student++) {
			names [student]= args[student];
			
		}
		//명령행 매개변수 학생이름 3명 입력 저장 배열
		//구현
		
		// 각 학생의 총점 / 평균
		// 이름 같이 출력   
		// xxx 학생 : { 점수들 } : 해당학생의 총점 = xxx : 해당학생의 평균 : xxx
		for(int i = 0; i < array2.length; i++) { // 3
			array2[i] = new int[i+2];
			double total = 0;
			double avg = 0;
	
			System.out.print(args[i] + " 학생 {" ); 
		
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = (int)(Math.random() * 100)+1;
				total = total + array2[i][j];
				avg = total/array2[i].length;
				System.out.print(array2[i][j] + " " );
			}
			System.out.println("}  :  해당학생의 총점 = "+ total + " 해당학생의 평균 = " + avg);
		
		}
		
	}//main end

}//class end



