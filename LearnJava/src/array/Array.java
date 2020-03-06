package array;

public class Array {

	public static void main(String[] args) {
		
		//array is a collection of elements of the same data type
				//Single Dimensional
				// Two or Multi Dimensional
		
		
		int a[]= new int [5]; // you can create this way if you don't know the insert values yet
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		System.out.println(a.length);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println();
		
		
		for (int i=0;( i<= a.length-1);i++ ) {
			System.out.println(a[i]);
			
		}
		
		
		/*int[] a= {1,2,3};   // if you know the initial insert values you can create it like this
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a.length);
		
		*/
		
		/*1-Declare an array
		 * 2- insert values
		 * 3-Find size of an array
		 * 4-Read values from an arrays
		 */
	}

}
