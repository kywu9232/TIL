package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		try {
		fo = new FileOutputStream("src/chap18/a.java");
			fo.write(65);
			fo.write(97);
			fo.write(13);
			fo.write('A');
			fo.write('a');
			fo.write('\n');
		}
		//os에게 반납
		catch(IOException e) {
			e.printStackTrace();
			}
		finally {	
							
		}
	}		
		
}