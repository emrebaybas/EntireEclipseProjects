package udemypractices;

import static  java.lang.Math.*;

import static  java.lang.System.out;

public class ImportStatement {

	public static void main(String[] args) {
		
		//System.out.println(Math.PI);  without java.lang.Math.*; import  we have to use Math.PI 
		
		System.out.println(PI); // now you can use just PI bc We imported Math package
		
						out.println(PI); // we dont need to type System anymore bc its statically imported
	}
}
