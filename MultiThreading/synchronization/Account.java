package synchronization;

public class Account 
{
	int accNo;
	int balance=10000;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

     void deposit(int amt)
	{
    	 synchronized (this) {
		
		System.out.print(Thread.currentThread().getName()+"-");
			int temp=0;
						temp = getBalance();
				temp = temp + amt;
				setBalance(temp);
		System.out.println(getBalance());
		
 		}
	}
}
