package ui;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance App");
		System.out.println();
		System.out.println("Starting Balances: ");
		
		CheckingAccount ca = new CheckingAccount(1000.0, 1);
		SavingsAccount sa = new SavingsAccount(1000.0, .01);
		printBalanceSummary(ca, sa);
		
		System.out.println();
		System.out.println("Enter montly transactions:");
		System.out.println();
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			String transType = Console.getString("Withdraw or deposit(w/d)?", "w", "d");
			String acctType = Console.getString("Checking(c) or Savings(s)?", "c", "s");
			double amount = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);
			Account account;
			if (acctType.equalsIgnoreCase("c")) {
				account = ca;
			}
			else {
				account = sa;
			}
			if (transType.equalsIgnoreCase("w")) {
				account.withraw(amount);
			}
			else {
				account.deposit(amount);
			}
			choice = Console.getString("Continue(y/n)? ","y","n");
		}
		
		ca.subtractMonthlyFee();
		sa.applyPaymentToBalance();
		System.out.println("Montly Payments and Fees: ");
		System.out.println("Checking Fee:              "+ca.getMonthlyFee());
		System.out.println("Savings Interest Payment:  "+sa.getMonthlyInterestPayment());
		
		System.out.println();
		System.out.println("Final Balances:  ");
		printBalanceSummary(ca, sa);
				
		System.out.println("Bye");

	}

	private static void printBalanceSummary(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: "+ca.getBalance());
		System.out.println("Savings:  "+sa.getBalance());
		
	}
}
