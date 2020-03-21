package String;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String x="You are a lucky man!";
		
		StringBuilder s=new StringBuilder();
		s.append(x);
		s=s.reverse();
	System.out.println(s);
//	-------------------------------------------------------------------------
	int i=123;
	String z=Integer.toString(i);
	System.out.println(z);

	String v="456";
	int u=Integer.parseInt(v);
	System.out.println(u);
		
	
	String p="You are a lucky man!";

	String[] words=p.split(" ");
	
	for (String st : words) {
		System.out.println(st);
	}
	
	}

}
