package business;

public class CheckingAccount extends Account {
	private double monthlyFee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFee() {
		balance -= monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}
	
}
