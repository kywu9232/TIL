class Calculator{
	//변수, 메소드, 생성자
	int num1, num2;
	String operator;
	
	void print() {
		int result = 0;
		if(operator.equals("+")) { result = num1 + num2;}
		else if(operator.equals("-")) { result = num1 - num2;}
		else if(operator.equals("*")) { result = num1 * num2;}
		else if(operator.equals("/")) { result = num1 / num2;}
		else {
			System.out.println("인식할 수 없는 연산자 입니다");
			return;
			
		}
		System.out.println(num1 + " " + operator + " "+ num2 + " = " + result);
	}
	
	Calculator(int num1, int num2,String operator){
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
}
	

public class CaculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator(100,50, "+");
		calc.print();
		Calculator cal2 = new Calculator(100,50, "-");
		calc.print();
		Calculator cal3 = new Calculator(100,50, "*");
		calc.print();
		Calculator cal4 = new Calculator(100,50, "/");
		calc.print();
		Calculator cal5 = new Calculator(100,50, " 더하기 ");
		}

	}


