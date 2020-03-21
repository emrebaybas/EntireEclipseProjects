import java.util.List;

public class ArrayElementIndex {

	public static void main(String[] args) {

			int[] a= {1,3,5,7,9};
		
			for (int i = 0; i < a.length; i++) {
				
				if (a[i]==5) {
					System.out.println(i);
					break;
				}
			}
		
	}
}