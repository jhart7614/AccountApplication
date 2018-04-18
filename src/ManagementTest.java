import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.google.gson. *;

public class ManagementTest {
	
	Service service = new Service();
	Account AC1 = new Account("John", "Smith", 2222);
	Account AC2 = new Account("Jim", "Smith", 3333);
	Account AC3 = new Account("Bob", "Smith", 4444);
	

	@Test
	public void retrievingFromMap() {
		
		service.addAccount(AC2);
	
		assertEquals( AC2, service.accountList.get(3333));
	}
	
	@Test
	public void addAndRemoveAccount() {
		
	assertEquals(service.getCount(), 0);	
	service.addAccount(AC2);
	assertEquals(service.getCount(), 1);
	service.addAccount(AC1);
	assertEquals(service.getCount(), 2);
	service.addAccount(AC3);
	assertEquals(service.getCount(), 3);
	service.removeAccount(AC2);
	assertEquals(service.getCount(), 2);
	service.removeAccount(AC1);
	assertEquals(service.getCount(), 1);
	}

}
