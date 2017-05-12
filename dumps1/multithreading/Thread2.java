package multithreading;

public class Thread2 extends Thread{

	Thread1 t2;
	public Thread2(Thread1 t1) {
	this.t2=t1;
	}

	public void run() {

	t2.tt.displayItems();
	}
}
