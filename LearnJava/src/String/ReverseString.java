package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String toReverse="healtyandrich";
		String reversed="";
		
		for (int i = 12; i >=0; i--) {
			
			reversed=reversed + toReverse.charAt(i);
			
		}
		System.out.println(reversed);
		
		System.out.println("*******");
		
		String x="You are a lucky man!";
		
		StringBuilder s=new StringBuilder();
		s.append(x);
		s=s.reverse();
		System.out.println(s);
		
	}

}
