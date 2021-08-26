/**
 * 
 */

/**
 * @author Jeewaka- SLIIT
 *
 */
public abstract class Account {
    private  String accountNo,name;
	protected double balance;
	
	
	abstract double  calculateInterest();
	
	public Account()
	{		
	}
	
	public Account(String accountNo, String name, double balance) {
		
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}



	void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	 void display()
	 {
		 System.out.println("Account No" + accountNo);
		 System.out.println("Name " + name);
		 System.out.println("Balance " + balance);
	 }
}
