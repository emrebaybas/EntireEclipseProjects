package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> custBook=new HashMap<String,Integer>();
		
		custBook.put("Emre Baybas", 2026778412);
		custBook.put("Fazil Kopru", 202333412);
		custBook.put("Erhan Ozcare", 2126778112);
		custBook.put("Ismail Gezer", 2026778412);
		
		Set<Map.Entry<String,Integer>>  s =custBook.entrySet();
		
		for (Map.Entry entry : s) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
			//OR  System.out.println(entry);
		}
		

//		
//		custBook.remove("Ismail Gezer");
//		System.out.println(custBook.keySet());
//		System.out.println(custBook.values());
//		System.out.println(custBook.entrySet());
//		System.out.println(custBook);
//		System.out.println(custBook.containsKey("Erhan Ozcare"));
//		System.out.println(custBook.get("Emre Baybas"));
//	
		
	
	
	
	}
}
