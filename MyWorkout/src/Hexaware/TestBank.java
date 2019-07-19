package Hexaware;

public class TestBank {

	public static void main(String[] args) {
		
		Sbi s1 = new Sbi();
		Icici i1 = new Icici();
		Axis a1 = new Axis();
		Bank b = new Bank();
		s1.getBal();
		s1.getInterestRate();
		i1.getInterestRate();
		b.withdraw(200);
		b.getBal();
		b.deposit(500.50);
		b.getBal();
		a1.getInterestRate();
		a1.deposit(100);
		a1.getBal();
		
		

}

}
