import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {

	public static void main(String[] args) {
		HashSet <Integer>lotto = new HashSet();
		while(true){
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
			
			if(lotto.size() == 6) {
				break;
				}
			}			
		System.out.println("나의 로또 번호 = " + lotto);
	Iterator it = lotto.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
		
	}
	
}
		//set 중복 데이터 저장 무시
		//lotto 1 - 45 난수 중복없이 6개 저장 - 출력
		//나의 로또 번호는 (lotto 저장 데이터들 6개) 입니다

	



