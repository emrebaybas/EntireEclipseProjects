package array;

public class Array3 {

	public static void main(String[] args) {
	
		//find min and max in two dimensional array
		
		   Integer[][] a ={ { 2, 44, 17, 55, 0 },{12,75,94,20,69},{13,85,24,21,39}}; 
			int maxOfArray=a[0][0];
			int minOfArray=a[0][0];
		   
		   for (int i = 0; i < a.length; i++) {
			   for (int j = 0; j < a[0].length; j++) {
				
				   if(maxOfArray<a[i][j]) {
					   maxOfArray=a[i][j];
				   }else if(minOfArray>a[i][j]) {
					   minOfArray=a[i][j];
				   }
			}
		}
	        System.out.println("min number of the array is: "+maxOfArray);
	        System.out.println("max number of the array is: "+minOfArray);  
	}
}
