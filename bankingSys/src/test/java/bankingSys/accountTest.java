package bankingSys;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class accountTest {

	@Test
	public void AccountCreateTestProper() {
		String user = "John_Doe";
		double amount = 10;

		Account cnt = new Account(user, amount);

		assertEquals(cnt.getBalance(), amount);
		assertEquals(cnt.getUser(), user);
	}

	@Test
	public void AccountCreateTestMissingUser() {

		double amount = 10;
		
		assertThrows(NullPointerException.class, () -> {
			new Account(null, amount);		
		});

	}
	
	@Test
	public void AccountCreateTestEmptyUser() {

		double amount = 10;
		String user = "";
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Account(user, amount);		
		});

	}

	@Test
	public void AccountCreateTestZeroBalance() {

		double amount = 0;
		String user = "John_Doe";
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Account(user, amount);		
		});

	}
	
	//Withdraw	
	@Test
	public void AccountWithdrawEnoughProper() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = 10;
		
		cnt.withdraw(allowance);
		
		assertEquals(cnt.getBalance(), amount-allowance);
	}
	
	@Test
	public void AccountWithdrawNotEnoughFail() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = 200;
		
		assertThrows(IllegalArgumentException.class, () -> {
			cnt.withdraw(allowance);		
		});
	}
	
	@Test
	public void AccountWithdrawNegativeFail() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = -10;
		
		assertThrows(IllegalArgumentException.class, () -> {
			cnt.withdraw(allowance);		
		});
	}
	
	
	@Test
	public void AccountWithdrawZeroFail() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = 0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			cnt.withdraw(allowance);		
		});
	}


}
