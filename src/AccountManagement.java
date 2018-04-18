
public class AccountManagement {

	public static void main(String[] args) {
		
		Account AC1 = new Account("John", "Smith", 2222);
		Account AC2 = new Account("Jim", "Smith", 3333);
		Account AC3 = new Account("Bob", "Smith", 4444);
		
		Service.addAccount(1, AC1);
		Service.addAccount(2, AC2);
		Service.addAccount(3, AC3);
		
		System.out.println(Service.RetrieveFromMap(1));
		
	}

}
