package client;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ScoreClient {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;		
		String inputfile ="input.txt";		
		fr = new FileReader(inputfile);
			
		try {
			Socket s = new Socket("116.125.189.194",40000);
			System.out.println("==서버 접속==");
			
			Scanner sc = new Scanner(fr);
			OutputStream o = s.getOutputStream();
		
			String name;
			while(sc.hasNextLine()) {
				name = sc.nextLine();								
				System.out.println(name);				
				o.write((name+"\n").getBytes());
				}
			
			
			s.close();
			System.out.println("==접속 해제==");	
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}


