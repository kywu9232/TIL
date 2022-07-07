package generic;

class Apple{
	String origin;
	Apple(String origin){
		this.origin = origin;
	}
}
class Paper{
	String size;
	Paper(String size){
		this.size = size;
	}
}
class Box<T>{
	T contents;

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
}

class TwoBox<T1 ,T2>{
	T1 o1;
	T2 o2;
	TwoBox(T1 o1, T2 o2){
		this.o1 = o1;
		this.o2 = o2;
	}	
}

class ThreeBox<T extends Number>{ //Integer, Double ...
	T num ;
	ThreeBox(T num){
		this.num=num;
	}
}



public class BoxTest {
	public static void main(String[] args) {
		ThreeBox<Integer> threebox = new ThreeBox(100);
		ThreeBox<Double> threebox2 = new ThreeBox(567.89);
		System.out.println(threebox.num.getClass().getName());
		System.out.println(threebox2.num.getClass().getName());
		
		
		/*TwoBox<Apple,Paper> twobox = new TwoBox(new Apple("경북영주"), new Paper("B5"));
		System.out.println(twobox.o1.getClass().getName());
		System.out.println(twobox.o2.getClass().getName());
		
		TwoBox<String,Integer> twobox2 = new TwoBox("경북영주", 100);
		System.out.println(twobox2.o1.getClass().getName());
		System.out.println(twobox2.o2.getClass().getName());*/
		
		
		
	/*	Apple a = null;
		Paper p = null;
		
		if(args[0].equalsIgnoreCase("apple")){
			Box<Apple> b1 = new Box<Apple>();
			b1.setContents(a);
			Apple o = b1.getContents();
			System.out.println(o.origin);
		}
		else if(args[0].equalsIgnoreCase("paper")) {
			p = new Paper(args[1]);
			Box<Paper> b2 = new Box<Paper>();
			b2.setContents(p);
			Paper o = b2.getContents();
			System.out.println(o.size);
		}*/


	}

}
