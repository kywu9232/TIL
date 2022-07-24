import java.util.Scanner;

public class ProductDAO {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품번호: ");
		int num = sc.nextInt();
		System.out.print("상품명: ");
		String name = sc.next();
		System.out.print("가격: ");
		int price = sc.nextInt();
		System.out.print("제조년도: ");
		int year = sc.nextInt();
		System.out.print("제조사: ");
		String maker = sc.next();
		
		ProductDTO dto = new ProductDTO();
		dto.setPrdNo(num);
		dto.setPrdName(name);
		dto.setPrdPrice(price);
		dto.setPrdYear(year);
		dto.setPrdMaker(maker);

				
		System.out.println("상품번호  상품명    가격    제조년도   제조사");
		System.out.println("======================================");
		System.out.println(dto);
		System.out.println("======================================");
	}

}
