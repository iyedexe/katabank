package bankingSys;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;
import java.util.Calendar;



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
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Client(firstName, lastName);		
		});
	
	}
	
	@Test
	public void ClientCreateNullFirstName() {
		
		String firstName = null;
		String lastName = "DOE";
		
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	
	@Test
	public void ClientCreateEmptyLastName() {
		
		String firstName = "John";
		String lastName = "";
		
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	@Test
	public void ClientCreateEmptyFirstName() {
		
		String firstName = "";
		String lastName = "DOE";
		
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Client(firstName, lastName);		
		});
	}
	
	@Test
	public void ClientAdressVerificationProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful

		String adress = "13 rue de France";
		testClient.setAdress(adress);
		
		assertEquals( testClient.getAdress(), adress);
	
	}
	
	
	@Test
	public void ClientBirthDateVerificationProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful

		
        Calendar c1 = Calendar.getInstance(); 
        c1.set(Calendar.MONTH, 11); 
        c1.set(Calendar.DATE, 21); 
        c1.set(Calendar.YEAR, 1993); 
  
        // creating a date object with specified time. 
        Date birthday = c1.getTime(); 
		
		testClient.setBirthDate(birthday);
		
		assertEquals( testClient.getBirthDate(), birthday);
	
	}
	
	@Test
	public void ClientBirthPlaceVerificationProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful

		String birthPlace = "Paris";
		testClient.setBirthPlace(birthPlace);
		
		assertEquals( testClient.getBirthPlace(), birthPlace);
	
	}
	
	
	@Test
	public void ClientStatusVerificationProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful

		String status = "Engineer";
		testClient.setStatus(status);
		
		assertEquals( testClient.getStatus(), status);
	
	}
	
	@Test
	public void ClientPhoneNumberVerificationProper() {
		
		String firstName = "John";
		String lastName = "DOE";
		
		//Proper client creation and instanciation only needs name and last name
		Client testClient = new Client(firstName, lastName);
		
		assertNotNull(testClient);
		//because you can never be too careful

		String phoneNumber = "01 11 11 11 11";
		testClient.setPhoneNumber(phoneNumber);
		
		assertEquals( testClient.getPhoneNumber(), phoneNumber);
	
	}
	
	

}
