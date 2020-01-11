package bankingSys;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;



import org.junit.jupiter.api.Test;


class clientTest {

	@Test
	public void ClientCreateProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful
		assertEquals(testClient.getFirstName(), firstName);
		assertEquals(testClient.getLastName(), lastName);		
	}
	
	@Test
	public void ClientCreateNullLastName() {
		
		String firstName = "John";
		String lastName = null;
		
		assertThrows(NullPointerException.class, () -> {
			new Client(firstName, lastName);		
		});
	
	}
	
	@Test
	public void ClientCreateNullFirstName() {
		
		String firstName = null;
		String lastName = "DOE";
		
		
		assertThrows(NullPointerException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	
	@Test
	public void ClientCreateEmptyLastName() {
		
		String firstName = "John";
		String lastName = "";
		
		
		assertThrows(NullPointerException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	@Test
	public void ClientCreateEmptyFirstName() {
		
		String firstName = "";
		String lastName = "DOE";
		
		
		assertThrows(NullPointerException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	
	
	
	

}
