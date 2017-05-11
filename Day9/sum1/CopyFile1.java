package sum1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile1 {

	public static void main(String[] args) {

		
		File f1 = new File("q1.txt");
		File f2  = new File("q2.txt");
		Scanner input= new Scanner(System.in);
		
		
		
		
		if (f1.exists()) {
			
			if(f2.exists()) {
			
				System.out.println("Do you want to overwrite?   Y/N \n Y to Overwrite \n N to Append");
				String s=input.next();
				
				
				if(s.equals("Y"))
				{
				
				String str=null;
				
				try {
					FileReader fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr);
					
					PrintWriter pw = new PrintWriter(f2);
					while((str=br.readLine()) != null)
					{
						pw.println(str);
						System.out.println(str);
					}
					br.close();
					pw.close();
					System.out.println("done");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else
				{
					System.out.println("here to append");
					try {
						FileReader fr2 = new FileReader(f1);
						BufferedReader br2 = new BufferedReader(fr2);
						
						PrintWriter pw2 = new PrintWriter(new FileOutputStream(f2,true));
						
						String asd= null;
						
						
						while((asd=br2.readLine()) != null)
						{
						
						pw2.append(asd);
					
						
						}
						System.out.println("appended done");
						br2.close();
						pw2.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
			}
			
			else
			{
				try {
					f2.createNewFile();
					String str1=null;
					FileReader fr1 = new FileReader(f1);
					BufferedReader br1 = new BufferedReader(fr1);
					
					PrintWriter pw1 = new PrintWriter(f2);
					
					
					while((str1=br1.readLine()) != null)
					{
						pw1.println(str1);
						System.out.println(str1);
						
					}
					br1.close();
					pw1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			
		}
		else {
			System.out.println("file 1 doesnt exists");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
