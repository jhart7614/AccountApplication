package ManagementTests;
import Account.*;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;

import org.junit.Test;

public class SearchForNameTest {
	
	Account AC1 = new Account("John", "Smith", 2222);
	Account AC2 = new Account("Jim", "Sam", 3333);

	private Service service = new Service();
	
	@Test
	public void test() {
		service.addAccount(AC1);
		service.addAccount(AC2);
		int expectedValue = 1;
		MapCycler mapcycler = new MapCycler();
		int actualValue = mapcycler.mapCycler("John", service);
		Assert.assertEquals(expectedValue, actualValue);
	}
		
}
