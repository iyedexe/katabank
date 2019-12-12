package bankingSys;

public class Account {

	private double balance;
	private String userId;

	public Account(String user, double i) {
		if (user == null)
			throw new NullPointerException("User name cannot be null");
		if (user.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");

		if (i < 10)
			throw new IllegalArgumentException("Starting balance must be more than 10 bleeps");

		userId = user;
		balance = i;
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
		// TODO Auto-generated method stub
		// Some kind of mechanism to record the withdrawal at this time from which atm
		// or whatever
		if (allowance <0) throw new IllegalArgumentException("Withdrawn cannot be negative Sir!");
		if (allowance == 0) throw new IllegalArgumentException("Withdrawn cannot be zero Sir!");
		double newbalance = balance - allowance;
		if (newbalance < 0)
			throw new IllegalArgumentException("Not enough credit in your account Sir!");
		else
			balance = newbalance;
	}

}
