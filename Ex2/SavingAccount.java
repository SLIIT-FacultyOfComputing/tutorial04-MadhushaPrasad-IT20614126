package Ex2;

public class SavingAccount 	extends FixedDepositAccount{

	void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	double calculateInterest()
	{
		Interest = balance * interestRate/100/12;
		return Interest;
	}
	
}
