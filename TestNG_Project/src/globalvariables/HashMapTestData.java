package globalvariables;

import java.util.HashMap;

public class HashMapTestData {
	
	public static HashMap<String,String> getLoginCredentials() {
		
		HashMap<String,String> loginData=new HashMap<String,String>();
		
		loginData.put("Valid user", "Admin_admin123");
		loginData.put("Invalid user", "Admin_admin123");
		
		return loginData;
	}

}
