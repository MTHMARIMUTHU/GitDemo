package Hexaware;

public class Sbi extends Bank{
	
	
	
	public double getInterestRate() {
		balance = balance + 5.0;
		System.out.println("SBI interestRate is" + balance );
		return balance;
	}

}
