package tpwalapackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSeWriting {

	public static void main(String[] args) {
		
		
		File f = new File("jh.txt");
		   
	      try { 
	        FileWriter fr = new FileWriter(f);
	        BufferedWriter bw= new BufferedWriter(fr);
	        bw.write("champion");
	        
	        System.out.println("after read");
	       bw.close();
	       System.out.println(f.length());
	      } catch (FileNotFoundException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
		
		
		

	}

}
