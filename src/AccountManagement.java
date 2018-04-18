import com.google.gson. *;

public class AccountManagement {

	public static void main(String[] args) {
		
		Service services = new Service();
		Account AC1 = new Account("John", "Smith", 2222);
		Account AC2 = new Account("Jim", "Smith", 3333);
		Account AC3 = new Account("Bob", "Smith", 4444);
		
	
		services.addAccount(AC1);
		services.addAccount(AC2);
		services.addAccount(AC3);
		
		System.out.println(services.RetrieveFromMap(2222));
		System.out.println(services.RetrieveFromMap(3333));
		System.out.println(services.RetrieveFromMap(4444));
		
		
		Gson gson = new Gson(); 
		String json = gson.toJson(services.getList());
		System.out.println(json);
		
	}
}
