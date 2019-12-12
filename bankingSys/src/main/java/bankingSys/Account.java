package bankingSys;

import java.util.Stack;

public class Account {

	private double balance;
	private String userId;
	Stack<Operation> operationHistory;

	public Account(String user, double i) {
		if (user == null)
			throw new NullPointerException("User name cannot be null");
		if (user.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");

		if (i < 10)
			throw new IllegalArgumentException("Starting balance must be more than 10 bleeps");

		userId = user;
		balance = i;
		operationHistory = new Stack<Operation>();
		operationHistory.push(new Operation("CREATE ACCOUNT",balance,0));
		
	}

	public Object getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public Object getUser() {
		// TODO Auto-generated method stub
		return userId;
	}

	public void withdraw(double allowance) {
		// Some kind of mechanism to record the withdrawal at this time from which atm
		// or whatever
		if (allowance <0) throw new IllegalArgumentException("Withdrawn cannot be negative Sir!");
		if (allowance == 0) throw new IllegalArgumentException("Withdrawn cannot be zero Sir!");
		double newbalance = balance - allowance;
		if (newbalance < 0)	throw new IllegalArgumentException("Not enough credit in your account Sir!");
		
		operationHistory.push(new Operation("WITHDRAWAL",-1*allowance,balance));
		balance = newbalance;
		
		
	}

	public Stack<Operation> operationHistory() {
		// TODO Auto-generated method stub
		return operationHistory;
	}

	public void deposit(double depot) {
	
		if (depot <0) throw new IllegalArgumentException("Deposit cannot be negative Sir!");
		if (depot == 0) throw new IllegalArgumentException("Deposit cannot be zero Sir!");

		operationHistory.push(new Operation("DEPOSIT",depot,balance));
		balance = balance + depot;

	}

}
