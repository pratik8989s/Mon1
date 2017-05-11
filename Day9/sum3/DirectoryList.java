package sum3;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the directory name");
		String s=input.next();
		
		File dir = new File("d:\\Day7&8");
		if(dir.exists())
		{
			String[] listing = dir.list();
		      
		    for (String z: listing) {
		      System.out.println( z );
		    
		}
		}
		else
		{
			System.out.println("gtdfgfgf");
		}
			
	}

}
