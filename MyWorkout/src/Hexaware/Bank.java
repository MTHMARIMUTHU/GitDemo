package Hexaware;

public  class Bank {
	
	double balance = 2000;
	
	//public abstract double getInterestRate(double interest);
	
		 public double getInterestRate(double interest) {
			System.out.println("Bank getInterestRate");
			return interest;
			} 
	
		
		public void withdraw(double debit) {
			
			
			if(balance>debit) {
				balance = balance-debit;
				System.out.println("withdrawal");
			}else
			{
				System.out.println("No enough amount");
			
			
			}}
		
		
		public double deposit(double credit) {
			balance = balance + credit;
			return balance;
		}
		
		public void getBal() {
			
			System.out.println("Bank get Balance" + balance);
		}

}
