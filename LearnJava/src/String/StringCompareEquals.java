package String;

public class StringCompareEquals {

	public static void main(String[] args) {

			String s="Emre";
			String a="em re";
			System.out.println(s.equals("Emre"));
			System.out.println(s.equals("em re"));
			System.out.println(s.equals("emre"));
			System.out.println(s.equalsIgnoreCase("emre"));
			
			//extra fix these. should be true
			System.out.println(s.equalsIgnoreCase(a.trim())); // it should show true fix this
			System.out.println(a.trim().equalsIgnoreCase(s)); // it should show true fix this
	}

}
