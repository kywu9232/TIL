package chap10;

public class RegularExpressionTest {

	public static void main(String[] args) {
		//String phones[] = {"010-1234-5678","011-1234-5678","010-12345-1234","010-^^^2-5"};
		//for(int i =0; i<phones.length; i++) {
			//System.out.println(phones[i].matches("(010|011)-.{3,5}-[0-9]*"));
			//System.out.println(phones[i].contains("1234"));
			
		
		String address = "서울시-서초구/서초동 테크부루:아카데미 3층";
		String [] result= address.split("(-|/|:| )");
		System.out.println(result.length);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
				
		
	}

}
