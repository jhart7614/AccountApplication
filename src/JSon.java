import java.util.HashMap;

import com.google.gson.Gson;

public class JSon {
	
	private Gson gson;
	
	public JSon() {
		
		this.gson = new Gson();
	}
		
	public String makeJSon(HashMap a) {
		
		return gson.toJson(a);
		
	}
	

}
