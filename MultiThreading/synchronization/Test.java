package synchronization;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Account ac=new Account();
		ac.setAccNo(11111);
		
		MyThread r1=new MyThread(ac);
	
	
	}

}
