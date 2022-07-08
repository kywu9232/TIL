package chap18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		File f = new File(name);
		if(f.exists()) {
			System.out.println("존재합니다");
			if(f.isFile()) {
				System.out.println("파일크기(byte단위)= " + f.length());
				System.out.println("전체경로= " + f.getCanonicalPath());
				System.out.println("파일읽기여부= " + f.canRead());
				System.out.println("파일쓰기여부= " + f.canWrite());
				long time = f.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM dd일 E, a hh:mm:ss");
				String timeString = sdf.format(time);
				System.out.println("최종수정시각= " + timeString);			
			}
			else {
				String[] details = f.list();
				System.out.println("============");
				for(String d : details){
					System.out.println(d);
				}
				System.out.println("=============");
			}
		}
		else {
			System.out.println(name + " 이름의 파일이나 디렉토리는 없습니다");
			System.out.println(f.mkdir());
		}
		

	}

}
