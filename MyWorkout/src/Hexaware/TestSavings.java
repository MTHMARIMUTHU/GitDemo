package Hexaware;

public class TestSavings {
	

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
		
		saver1.calculateMonthlyInterest();
		System.out.println(saver1.balance());
		saver2.calculateMonthlyInterest();
		System.out.println(saver2.balance());
		
		//SavingsAccount.modifyInterestRate(5);
		SavingsAccount.annualInterestRate = 5;
		saver2.calculateMonthlyInterest();
		System.out.println(saver2.balance());
		
		
		
		

	}

}
