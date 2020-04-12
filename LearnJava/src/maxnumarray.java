import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxnumarray {
	public static void main(String[] args) {
		
	Integer a[]= {1,3,9,5,7,6};
		
		List<Integer> l=Arrays.asList(a);
		
		System.out.println(l.indexOf(Collections.max(l)));
		
	
		Collections.reverse(l);
		
		System.out.println(l);
		
		
	}

}
