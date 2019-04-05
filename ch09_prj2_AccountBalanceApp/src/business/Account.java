package business;

public class Account implements Withdrawable, Depositable, Balanceable {

	protected double balance;
	
	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withraw(double amount) {
		balance -= amount;
	}

}
