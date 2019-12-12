package bankingSys;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Stack;

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
	
	//Deposit	
	@Test
	public void AccountDepositProper() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double depot = 10;
		
		cnt.deposit(depot);
		
		assertEquals(cnt.getBalance(), amount+depot);
	}
	
	@Test
	public void AccountDepositNegativeFail() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = -10;
		
		assertThrows(IllegalArgumentException.class, () -> {
			cnt.deposit(allowance);		
		});
	}
	
	@Test
	public void AccountDepositZeroFail() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		double allowance = 0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			cnt.deposit(allowance);		
		});
	}
	
	
	
	@Test
	public void BasicAccountHistoryCheck() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		
		Stack<Operation> oneSingleOperation = cnt.operationHistory();
		
		Operation op = oneSingleOperation.pop();

		assertNotNull(op.getDate());
		assertEquals(op.getOperation(), "CREATE ACCOUNT");
		assertEquals(op.getAmount(), 100);
		assertEquals(op.getBalance(), 100 );	
	}
	
	@Test
	public void CreationDepositAccountHistoryCheck() {
		//Account creation for JohnDoe with 100 blind
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		//Deposit 10
		double depot = 10;
		cnt.deposit(depot);
		
		Stack<Operation> twoOperation = cnt.operationHistory();
		
		Operation op = twoOperation.pop();
		assertNotNull(op.getDate());
		assertEquals(op.getOperation(), "DEPOSIT");
		assertEquals(op.getAmount(), 10);
		assertEquals(op.getBalance(), 110 );	

		op = twoOperation.pop();
		assertNotNull(op.getDate());
		assertEquals(op.getOperation(), "CREATE ACCOUNT");
		assertEquals(op.getAmount(), 100);
		assertEquals(op.getBalance(), 100 );	
	
	}

	@Test
	public void CreationWithdrawAccountHistoryCheck() {
		String user = "John_Doe";
		double amount = 100;
		Account cnt = new Account(user, amount);
		//Deposit 10
		double allowance = 10;
		cnt.withdraw(allowance);
		
		Stack<Operation> twoOperation = cnt.operationHistory();
		
		Operation op = twoOperation.pop();
		assertNotNull(op.getDate());
		assertEquals(op.getOperation(), "WITHDRAWAL");
		assertEquals(op.getAmount(), -10);
		assertEquals(op.getBalance(), 90 );	

		op = twoOperation.pop();
		assertNotNull(op.getDate());
		assertEquals(op.getOperation(), "CREATE ACCOUNT");
		assertEquals(op.getAmount(), 100);
		assertEquals(op.getBalance(), 100 );	
	}

	
	
}
