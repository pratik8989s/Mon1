package sync;

public class Data {
	 
	int n; 
	boolean valueSet = false; 
	synchronized int get()
	{ 
		if(valueSet==false) 
		{
			try { 
					wait(); 
				  } catch(InterruptedException e) 
				  { 
					System.out.println("InterruptedException caught"); 
				  	} 
		}
	System.out.println("Got: " + n); 
	valueSet = false; 
	notify(); 
	return n; 
	} 
	
	
	synchronized void put(int n) 
	{ 
		if(valueSet==true) 
		{
			try { 
					wait(); 
					} catch(InterruptedException e)
					{ 
					System.out.println("InterruptedException caught"); 
					} 
		}
		this.n = n; 
		valueSet = true; 
		System.out.println("Put: " + n); 
		notify(); 
	} 


}
