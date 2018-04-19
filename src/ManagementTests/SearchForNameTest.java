package ManagementTests;
import Account.*;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;

public class SearchForNameTest {

	private MapCycler mapcycler;
	
	@Test
	public void test() {
		
		mapcycler = new MapCycler();
		int expectedValue = 2;
		int actualValue = mapcycler.MapCycler("John");
		Assert.assertEquals(expectedValue, actualValue);
	}
		

}
