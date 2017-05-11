package tpwalapackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSeReading2 {

	public static void main(String[] args) {


		File f = new File("jh.txt");
		
		
		try {
			FileReader xv = new FileReader(f);
			BufferedReader xc = new BufferedReader(xv);
			
			
			
			
			
			
			int i=0;
			while ((i=xc.read()) != -1) 
			{
		System.out.print((char)i);
		
			}
			
			
			
			
			
			
			xv.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
