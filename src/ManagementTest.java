import static org.junit.Assert.*;

import org.junit.Test;

public class ManagementTest {
	
	Service service = new Service();
	Account AC1 = new Account("John", "Smith", 2222);
	Account AC2 = new Account("Jim", "Smith", 3333);
	Account AC3 = new Account("Bob", "Smith", 4444);

	@Test
	public void addAccount() {
		
		
		Service.addAccount(1, AC1);
		Service.addAccount(2, AC2);
		Service.addAccount(3, AC3);
		
		assertSame("Actual not Expected", AC2, Service.accountlist.get(2));
	}
	
	@Test
	public void getFirstName() {
		
		assertSame("Actual not Expected", "jim", Account.getFirsName(AC1));
		
	}

}
