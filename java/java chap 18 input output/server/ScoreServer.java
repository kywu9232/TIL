package server;

import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(40000);
		System.out.println("==서버 동작==");
		FileWriter fw = null;		
		String outputfile ="output.txt";
		fw = new FileWriter(outputfile);
		
		while(true) {
			Socket s =ss.accept();			
			Scanner input = new Scanner(s.getInputStream());
			
			while(input.hasNextLine()) {
				String fromClient = input.nextLine();
				System.out.println(fromClient);
			
				String[] array_word;
				array_word = fromClient.split(" ");
				String str = Arrays.toString(array_word);
							
				int sum = 0;			
				for (int i = 1; i< array_word.length; i++) {
				sum += Integer.parseInt(array_word[i]);					
					}
				double avg = Math.round((double)sum/(array_word.length-1)*100)/100.0;			
				fw.write(fromClient + " 총점 : " + sum + ", 평균 : " +avg + "\n");			
				}
			fw.close();
			s.close();
		
		}

	}

}
