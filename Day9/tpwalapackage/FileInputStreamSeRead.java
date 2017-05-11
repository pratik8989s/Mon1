package tpwalapackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamSeRead {

	public static void main(String[] args) {
		
		File f = new File("D:\\501599\\Day8\\jhoomla.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis= new BufferedInputStream(fis);
			int i=0;
			while ((i=bis.read()) != -1) 
					{
				System.out.print((char)i);
				
					}
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
