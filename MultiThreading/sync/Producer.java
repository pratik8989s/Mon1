package sync;

public class Producer implements Runnable {
	Data q; 
	Thread t1;
	Producer(Data q) { 
	this.q = q; 
	t1=new Thread(this);
	t1.setName("Producer");
	t1.start();
	} 
	public void run()
	{ 
		for(int i=0;i<5;i++)
		{ 
			q.put(i); 
		} 
	} 

}
