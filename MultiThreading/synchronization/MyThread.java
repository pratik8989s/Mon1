package synchronization;

public class MyThread implements Runnable {
Account account;
Thread t1,t2;
	public MyThread(Account ac) {
		account=ac;
		t1=new Thread(this);	//runnable object to thread object
		t2=new Thread(this);
		t1.setName("Husband");
		t2.setName("Wife");
		t1.start();
		t2.start();
	}

	@Override
	public void run() 
	{
		for (int i = 0; i <5; i++) {
			account.deposit(500);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
