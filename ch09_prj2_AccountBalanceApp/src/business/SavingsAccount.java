package business;

public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}
	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}
	
	public void applyPaymentToBalance() {
		monthlyInterestPayment = balance*monthlyInterestRate;
		balance+=monthlyInterestPayment;
	}

}
