package Ex2;

public class MyMain {

	public static void main(String [] args) {
		
		Account acc1 = new FixedDepositAccount();  //fixed deposit object
		SavingAccount acc2 = new SavingAccount();   //savingAccount object
		
		acc1.deposit(10000);
		
		acc2.deposit(5000);
		acc2.withdraw(20.0);
		
		
		acc2.display();
		

	}

}
