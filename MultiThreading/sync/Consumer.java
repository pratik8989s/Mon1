package sync;

class Consumer implements Runnable { 
	Data q; 
	Consumer(Data q) { 
	this.q = q; 
	new Thread(this, "Consumer").start(); 
	} 
	public void run() 
	{ 
		for(int i=0;i<5;i++)
		{ 
			q.get(); 
		} 
	} 
	}


