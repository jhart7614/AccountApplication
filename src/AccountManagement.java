import com.google.gson. *;

public class AccountManagement {

	public static void main(String[] args) {
		
		Service services = new Service();
		Account AC1 = new Account("John", "Smith", 2222);
		Account AC2 = new Account("Jim", "Smith", 3333);
		Account AC3 = new Account("Bob", "Smith", 4444);
		
		services.addAccount(AC1);
		
		JSon util = new JSon();
		String json = util.makeJSon(services.accountList);
		System.out.println(json);
	   
	}
}
