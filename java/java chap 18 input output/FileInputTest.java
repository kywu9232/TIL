package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fi = null;
		try {
		fi = new FileInputStream("src/chap18/FileInputTest.java");
		while(true) {
			int result = fi.read();
			System.out.print((char)result);
			if(result == -1) {
				break;}
		}
		fi.close(); //os에게 반납
		}catch(IOException e) {
			e.printStackTrace();
		
		}finally {
			try {
				fi.close();
			}catch(IOException e) {}
			}
		}
	}


