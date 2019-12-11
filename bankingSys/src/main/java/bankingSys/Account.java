package bankingSys;

public class Account {

	private int balance;
	private String userId;
	
	public Account(String user, int i) {
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



}
