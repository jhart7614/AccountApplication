package Account;

import java.util.Map;

public class MapCycler {

	public int mapCycler(String firstName, Service service) {
		int count = 0;
		
		for(Map.Entry<Integer, Account> entry : service.getList().entrySet()) {
		   
			if(entry.getValue().getFirstName().equals(firstName)) {
				count++;
			}
		}
		return count;
	}
}
