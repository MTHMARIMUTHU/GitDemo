 package Hexaware;

public class SavingsAccount {
	
	 static double annualInterestRate;
	 private double savingsBalance;
	 
	 //Constructor 
	 SavingsAccount(double savingsBalance){
	 this.savingsBalance = savingsBalance;
		 
	 }



public void calculateMonthlyInterest() {
	
	double monthlyInterest;
	monthlyInterest = (annualInterestRate * savingsBalance)/12;
	savingsBalance = monthlyInterest+savingsBalance;
}


public static void modifyInterestRate(double InterestRate) {
	
	annualInterestRate = InterestRate;

}

public double balance() {
	return savingsBalance;
	
}



} 
