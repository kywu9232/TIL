package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest2 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		String inputfile ="src/chap18/FileCopyTest.java";
		String outputfile ="c.txt";
		
		/*입력파일 존재 x - 예외 발생 , 
		  입력파일 존재 o ,출력파일 존재 x  - empty 파일 생성해 출력
		  입력파일 존재o , 출력파일 존재 o  - 이전내용 삭제 후 출력
		  Writer에 true 줄시 입력파일 존재o , 출력파일 존재 o  - 이전내용 유지 추가 출력		  
		*/
		
		try {
			fr = new FileReader(inputfile);
			fw = new FileWriter(outputfile,true);
			Scanner sc = new Scanner(fr);			
			int linenum = 1;
			
			while(sc.hasNextLine()) {
				String linestr = linenum++ + "라인 : ";
				String fileline = sc.nextLine(); // 1줄 '\n' 이전까지만 입력
				fw.write(linestr + fileline + '\n');
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
