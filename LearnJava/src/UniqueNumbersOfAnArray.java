import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class UniqueNumbersOfAnArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,3,4,9,6,4,6,5,7,5};
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(!l.contains(a[i]))
				l.add(a[i]);	
		}
		System.out.println(l);
		
		
		
		
		
		
//		int b[]=Arrays.stream(a).distinct().sorted().toArray();
//		 
//for (int i : b) {
//	System.out.println(i);
//}

	}
}


























