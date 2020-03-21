package String;

public class String_vs_StringBuilder {

	public static void main(String[] args) {
		
//		String x="You are a lucky man!";
//		
//		System.out.println(x.concat(" Good for You!"));
//		System.out.println(x);
//		
//		System.out.println("****************");
//		
		StringBuilder s=new StringBuilder("You are a lucky man!");
		
		System.out.println(s.append(" Good for You!"));
		System.out.println(s);
		
		System.out.println(s.substring(21));
		
		//System.out.println(s.delete(21, 34));
		
	}
}
