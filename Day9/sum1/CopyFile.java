package sum1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {

	
public static void main(String[] args) {
		
		File q1 = new File(args[0]);
		File q2 = new File(args[1]);
		ArrayList<String> arr = new ArrayList<String>();
		String s=null;
		
		if (q1.exists()) {
			try {

				FileReader fr = new FileReader(q1);
				BufferedReader br = new BufferedReader(fr);
				
				while ((s=br.readLine()) != null) {
					
					arr.add(s);
					System.out.println(s);
					
				}
				
				
				System.out.println("File Read Successful");
				br.close();

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("Source File does not exist.");
			
		}


		if (q2.exists()) {
			try {
				System.out.println("Want to Overwrite? (yes/no)");
				Scanner scan = new Scanner(System.in);
				String ans = scan.nextLine();
				if(ans.equalsIgnoreCase("yes"))
				{
					FileWriter fw = new FileWriter(q2);
					BufferedWriter bw = new BufferedWriter(fw);
					//System.out.println(s);
					//String a = s;
					
					for (int i = 0; i < arr.size(); i++) {
						bw.write(arr.get(i));
					}
					
					System.out.println("File overwritten");
					bw.close();}
				else
				{
					FileWriter fw = new FileWriter(q2,true);
					BufferedWriter bw = new BufferedWriter(fw);
					//String b= s;
					for (int i = 0; i < arr.size(); i++) {
						
					
					//System.out.println(b);
					bw.append(arr.get(i));
					}
					System.out.println("File appended");
					bw.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		} else {
			try {
				q2.createNewFile();
				FileWriter fw = new FileWriter(q2);



				BufferedWriter bw = new BufferedWriter(fw);
				String a = s;

				bw.write(a);
				System.out.println("File copied");
				bw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	
}
