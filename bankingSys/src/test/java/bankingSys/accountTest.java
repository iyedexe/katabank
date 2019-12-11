package bankingSys;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class accountTest {

	@Test
	public void AccountCreateTest() {
		String user = "John_Doe";
		int amount = 10;
		
		Account cnt = new Account(user, amount);
		
		assertEquals(cnt.getBalance(), amount);
		assertEquals(cnt.getUser(), user);
	}


}
