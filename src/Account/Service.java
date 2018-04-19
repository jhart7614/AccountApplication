package Account;
import java.util.HashMap;

public class Service {
	
	static HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
	
	private int count = 0; 

	public void addAccount(Account account) {

		accountList.put(account.getAccountNumber(), account);
		
		count = count + 1;
	}

    public int getCount() {
    	
    return count;	
    
    }
    
	public void removeAccount(Account account) {
		
		accountList.remove(account);
		count = count - 1;
	}

	public HashMap<Integer, Account> getList() {

		return accountList;
	}
	
	public String RetrieveFromMap(int number) {

		return "First Name: " + accountList.get(number).getFirstName() + " Last Name: " + accountList.get(number).getLastName() + " Account Number: " + accountList.get(number).getAccountNumber();
		
	}
	
	public Account retrieveFromMap(int number) {
		return accountList.get(number);
	}

}
