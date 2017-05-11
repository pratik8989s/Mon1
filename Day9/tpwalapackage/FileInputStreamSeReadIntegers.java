package tpwalapackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSeReadIntegers {

	public static void main(String[] args) {

		File f = new File("D:\\501599\\Day8\\jhoomla.txt");
		
		try {
			FileInputStream fis= new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int a=bis.read();
			System.out.println(a);
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
