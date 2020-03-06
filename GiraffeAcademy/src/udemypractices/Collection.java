package udemypractices;

public class Collection {

	public static void main(String[] args) {
		double a[]= {1,2};
		double b[]= {3,4};
		
		Pair<String> p1=new Pair <>("XYZ","ABC");
		Pair<Integer> p2=new Pair <>(1,2);
		Pair<Double> p3=new Pair <>(a[1],b[1] );
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
 