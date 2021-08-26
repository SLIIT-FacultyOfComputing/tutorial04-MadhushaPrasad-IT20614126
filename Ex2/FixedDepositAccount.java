package Ex2;

public class FixedDepositAccount extends Account {
	protected double interestRate , Interest ;

	public double getInterest() {
		return Interest;
	}

	public void setInterest(double interest) {
		Interest = interest;
	}

	@Override
	double calculateInterest() {
		Interest = balance * interestRate/100 ; 
		return 	Interest;
	}

}

