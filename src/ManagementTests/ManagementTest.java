package ManagementTests;
import static org.junit.Assert.*;

import org.junit.Test;
import Account.Account;
import Account.JSon;
import Account.Service;

public class ManagementTest {
	
	Service service = new Service();
	JSon Json = new JSon();
	Account AC1 = new Account("John", "Smith", 2222);
	Account AC2 = new Account("Jim", "Smith", 3333);
	Account AC3 = new Account("Bob", "Smith", 4444);

	@Test
	public void retrievingFromMap() {
		
		service.addAccount(AC2);
	
		assertEquals( AC2, service.getList().get(3333));
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
	
	@Test
	public void checkJson() {
		
	service.addAccount(AC1);
	String expected = "{\"2222\":{\"firstName\":\"John\",\"lastName\":\"Smith\",\"AccountNumber\":2222}";
	JSon util = new JSon();
	String Test = util.makeJSon(service.getList());
	assertEquals(Test, expected);

}
}
