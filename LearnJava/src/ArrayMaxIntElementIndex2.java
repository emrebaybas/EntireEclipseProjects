import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMaxIntElementIndex2 {

	public static void main(String[] args) {

	
        Integer[] a = { 2, 44, 17, 55, 9,66,87,92,123,34,51}; 
        
        List<Integer> list=Arrays.asList(a);
        
        int indexOfMax=list.indexOf(Collections.max(list));
    
        System.out.println(indexOfMax);
        
        int indexOfMin=list.indexOf(Collections.min(list));
        
        System.out.println(indexOfMin);
        
	}
}