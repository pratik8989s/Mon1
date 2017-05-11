package tpwalapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterseWrite {

	public static void main(String[] args) {
		
		
		File f = new File("D:\\501599\\Day8\\jhoomla.txt");
		PrintWriter pr;
		try {
			pr = new PrintWriter(f);
			pr.println("yes");
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
