package multithreading;

public class Thread1 extends Thread{

	Item t=new Item();
	Item tt;
	public Thread1(Item t) {
		this.tt=t;
	}
	public void run() {

		
		Item t1=new Item(12, "sljdsfgh");
		Item t2=new Item(134, "sljdefgh");
		Item t3=new Item(1342, "slsdfjdgh");
		Item t4=new Item(152, "sljsdfdgh");
		Item t5=new Item(132, "sljsdgh");

		tt.at.add(t1);
		tt.at.add(t2);
		tt.at.add(t3);
		tt.at.add(t4);
		tt.at.add(t5);
		System.out.println("added");
	}
}
