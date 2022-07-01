package chap5;

abstract class Shape{
	String name;
	abstract void area();
	abstract void circum();
}
class Circle extends Shape{
	int radius;
	final double pi = 3.14;
	//생성자 정의 , area circucm 오버라이딩
	Circle(String name,int radius){
		this.radius = radius;				
	}
	void area() {
		System.out.println("원의 면적 = " + radius*radius*pi);			
	}
	void circum() {
		System.out.println("원의 둘레 = " + radius*pi);
	}
		
}

class Rectangle extends Shape{
	int width;
	int height;
	//생성자 정의 , area circucm 오버라이딩
	Rectangle(String name,int width, int height){
		this.width = width;
		this.height = height;		
	}
	void area() {
		System.out.println("사각형의 넓이 = " +width*height);
	}
	void circum() {
		System.out.println("사각형의 둘레 = " + (width+height)*2);
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Circle c = new Circle("원",5); //()안에는 생성자에 들어가는 것
		Rectangle r = new Rectangle("사각형", 6 , 8);
		c.area();
		r.area();
		c.circum();
		r.circum();
	}

}
