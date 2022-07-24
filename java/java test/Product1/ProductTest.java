import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);	
				
		while(true) {
		System.out.println("==상품 관리 프로그램을 시작합니다==");
		System.out.println("1. 시작");
		System.out.println("0. 종료");
		System.out.print("메뉴 입력:");
		int menu = sc.nextInt();
		if(menu == 0 ) {System.exit(0);}
		else if(menu == 1) {	
			ProductDAO dto = new ProductDAO();
			dto.input();
		
			}
	
		}
	}

}
