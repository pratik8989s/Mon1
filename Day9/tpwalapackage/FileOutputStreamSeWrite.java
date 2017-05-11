package tpwalapackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSeWrite {

	public static void main(String[] args) {
	
	File f = new File("D:\\501599\\Day8\\jhoomla.txt");
	
	
	FileOutputStream fos;
	try {
		fos = new FileOutputStream(f);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		
		String s="hello";
		
		bos.write(s.getBytes());
		
		
		bos.close();
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
