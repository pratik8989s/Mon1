package sum2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		
		Scanner input = new Scanner(System.in);
		
		File f = new File("letter.txt");
		PrintWriter pw = new PrintWriter(f);
		String[] sl = new String[5];

		if (f.exists()) {
			System.out.println("Enter 5 lines");
			for (int i = 0; i < sl.length; i++) {

				sl[i] = input.nextLine();
				pw.println(sl[i]);
				
			}
			pw.close();
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
	
			String st=null;
			
			while((st=br.readLine()) != null)
			{
				System.out.println(st);
				
			}
			br.close();
		}

		// ***********************************************************
		else {
			try {
				f.createNewFile();
				FileWriter fr = new FileWriter(f);
				fr.close();
				System.out.println("now it exists");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//f.delete();

	}

}
