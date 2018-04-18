import java.util.ArrayList;
import java.util.HashMap;

public class Service {
	
	private static HashMap<Integer, Account> accountlist = new HashMap<Integer, Account>();

	public static void addAccount(int key, Account Account) {

		accountlist.put(key, Account);

	}

	public static HashMap<Integer, Account> getList() {

		return accountlist;
	}
	
	public static String RetrieveFromMap(int Key) {

		return "First Name: " + accountlist.get(Key).getFirstName() + " Last Name: " + accountlist.get(Key).getLastName() + " Account Number: " + accountlist.get(Key).getAccountNumber();
	}

	public static void setAccountlist(HashMap<Integer, Account> accountlist) {
		Service.accountlist = accountlist;
	}

}
