package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		String inputfile ="src/chap18/FileCopyTest.java";
		String outputfile ="b.txt";
		
		/*입력파일 존재 x - 예외 발생 , 
		  입력파일 존재 o ,출력파일 존재 x  - empty 파일 생성해 출력
		  입력파일 존재o , 출력파일 존재 o  - 이전내용 삭제 후 출력
		  Writer에 true 줄시 입력파일 존재o , 출력파일 존재 o  - 이전내용 유지 추가 출력		  
		*/
		
		try {
			fr = new FileReader(inputfile);
			fw = new FileWriter(outputfile,true);
			int i = 1;	
			String line = i + "라인 : ";	
			fw.write(line);
			
			while(true) {
				int result = fr.read();
				if(result == -1) {break;}
				fw.write(result);
				
				if(result == '\n') {			
					fw.write(++i + "라인 : ");								
				}												
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			fr.close();
			fw.close();
			}catch(IOException e) {}
		}

	}

}
