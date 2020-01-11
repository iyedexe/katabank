package bankingSys;

import java.util.Date;

public class Client {
	private String firstName;
	private String lastName;
	private String adress;
	private Date birthDate;
	private String birthPlace;
	private String status;
	private String phoneNumber;
	
	
	public Client(String name, String familyName) {
		
		if (name == null)
			throw new IllegalArgumentException("Client First Name cant be null");
		
		if (familyName == null)
			throw new IllegalArgumentException("Client Last Name cant be null");

		if (name.length() == 0)
			throw new IllegalArgumentException("Client First Name must contain at least one caracter");
		
		if (familyName.length() == 0)
			throw new IllegalArgumentException("Client Last Name must contain at least one caracter");
		
		
		firstName = name;
		lastName = familyName;
		
	}


	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}


	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}


	public void setAdress(String myAdress) {
		// TODO Auto-generated method stub
		if (myAdress == null)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else if (myAdress.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else
			adress = myAdress;

	}


	public String getAdress() {
		// TODO Auto-generated method stub
		return adress;
	}


	public void setBirthDate(Date myBirthday) {
		// TODO Auto-generated method stub
		if (myBirthday == null)
			throw new IllegalArgumentException("Birthday parameter cannot be null");
		else
			birthDate = myBirthday;
	}


	public Date getBirthDate() {
		// TODO Auto-generated method stub
		return birthDate;
	}


	public void setBirthPlace(String myBirthPlace) {
		// TODO Auto-generated method stub
		if (myBirthPlace == null)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else if (myBirthPlace.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else
			birthPlace = myBirthPlace;

	}


	public String getBirthPlace() {
		// TODO Auto-generated method stub
		return birthPlace;
	}


	public void setStatus(String myStatus) {
		// TODO Auto-generated method stub
		if (myStatus == null)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else if (myStatus.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else
			status = myStatus;
	}


	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}


	public void setPhoneNumber(String myPhoneNumber) {
		// TODO Auto-generated method stub
		if (myPhoneNumber == null)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else if (myPhoneNumber.length() == 0)
			throw new IllegalArgumentException("User name must contain at least one caracter");
		else
			phoneNumber = myPhoneNumber;
	}


	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}


}
