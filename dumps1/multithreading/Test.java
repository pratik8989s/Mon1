package multithreading;

public class Test {

	public static void main(String[] args) {
		Item t=new Item();
		Thread1 t1=new Thread1(t);
		
		
		
		
		Thread2 t2=new Thread2(t1);
		t1.start();
		t2.start();
		
		/*try {
			t2.start();
			t2.join();
			t1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
