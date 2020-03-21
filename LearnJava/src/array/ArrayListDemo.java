package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//
//		ArrayList<String> serviceProvider=new ArrayList<String>();
//		serviceProvider.add("T-mobile");
//		serviceProvider.add("AT&T");
//		serviceProvider.add("Verizon");
//		serviceProvider.add("Sprint");
//		System.out.println(serviceProvider);
//		
//		serviceProvider.remove("Verizon");
//		System.out.println(serviceProvider);
//		
//		Collections.reverse(serviceProvider);
//		System.out.println(serviceProvider);
//		
//		Collections.sort(serviceProvider);
//		System.out.println(serviceProvider);
//
//		serviceProvider.set(2, "T-mobile was better than Verizon");
//		System.out.println(serviceProvider);
//		
//		for (int i = 0; i < serviceProvider.size(); i++) {
//			System.out.println(serviceProvider.get(i));	
//		}
//		
//		for (String s : serviceProvider) {
//			System.out.println(s);
//		}
//	
	Integer x[]= {1,3,8,4,12,2};
	
	List<Integer> lst=Arrays.asList(x);
	
	Iterator<Integer> i=	lst.iterator();
	
	//if you want to move in the list one by one iterator.next
	System.out.println(i.next() ); 
	
	//If you want to go thru all use condition i.hasNext() in a while loop
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	
	
//	System.out.println(Collections.max(lst));
//	System.out.println(lst.indexOf(Collections.max(lst)));
//	System.out.println(lst.indexOf(8));
//	Collections.sort(lst);
//	System.out.println(lst);
//	System.out.println(lst.get(lst.size()-1));
	
	}
}
