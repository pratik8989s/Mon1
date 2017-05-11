package tpwalapackage;

import java.io.File;


public class io {

	public static void main(String[] args) {
		
		
		File f = new File("D:\\501599\\Day8\\jhoomla.txt");
		
		
		
		//*****************************************************
		
		
		//FileInputStreamSeReadIntegers
		
		
		/*try {
			FileInputStream fis= new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int a=bis.read();
			System.out.println(a);
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//*****************************************************
		
		
		//FileInputStreamSeRead
		
		
			/*try {
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
			}*/
			
		//*****************************************************
		
		//FileOutputStreamSeWrite
			
			
		/*FileOutputStream fos;
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
		}*/
		
	//*****************************************************	
		
			
			
		//PrintWriterSeWrite
			
			
		/*PrintWriter pr;
		try {
			pr = new PrintWriter(f);
			pr.println("yes");
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//*****************************************************		
		
		

	
	}
	
	
}

