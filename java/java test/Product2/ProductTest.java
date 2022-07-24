package javaExam;

public class ProductTest {
	public static void main(String[] args) {	
		ProductDTO dto = new ProductDTO();
		System.out.println("상품번호  " + "상품명    " + "가격    " + "제조년도  " + "제조사");
		System.out.println("====================================");
		System.out.println(dto.toString(100,"노트북",1200000,2021,"삼성"));
		System.out.println(dto.toString(200,"아이패드",500000,2022,"애플"));
		System.out.println(dto.toString(200,"마우스",15000,2021,"LG"));
		System.out.println("====================================");
			
	}

}
