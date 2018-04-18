
public class Account {
	
	private static String firstName;
	private static String lastName;
	private static int AccountNumber;
	
	public Account(String firstName, String lastName, int AccountNumber ) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.AccountNumber = AccountNumber;
	}

	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	

}
