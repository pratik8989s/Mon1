package tpwalapackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tp {

	public static void main(String[] args) {
		File f = new File("jh.txt");
	   
	      try { 
	        FileWriter fr = new FileWriter(f);
	        fr.write("champion");
	        System.out.println("after read");
	       fr.close();
	       System.out.println(f.length());
	      } catch (FileNotFoundException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    	
	      
	      System.out.println("Now will priting whats written in file");
	    	
	      try {
			FileReader xv = new FileReader(f);
			BufferedReader xc = new BufferedReader(xv);
			
			
			
			String s=null;
			while((s=xc.readLine()) != null)
			{
				System.out.println(s);
			}
			
			
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
	      
	      
	    	
	    	
	    
	    	/*else { 
	    	System.out.println("it doesnt exists");
	    	System.out.println(f.length());*/
	    	/*
	    	try {
	            f.createNewFile();
	            FileWriter fr = new FileWriter(f);
	            fr.close();
	            System.out.println("now it exists");
	          } catch (IOException e) {
	            e.printStackTrace();
	          }

	    	*/
	    //}

		
		
		
		
	    /*File x = new File( "d:\\" );
	    String[] listing = x.list();
	      
	    for (String f: listing) {
	      System.out.println( f );
	    }*/
	}


}
