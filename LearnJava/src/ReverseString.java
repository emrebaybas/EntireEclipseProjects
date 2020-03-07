
public class ReverseString {

	public static void main(String[] args) {
	
		String toReverse="emre";
		String reversed="";

		for (int i = toReverse.length()-1; i >=0; i--) {
			char x=toReverse.charAt(i);
			reversed=reversed+x;
		}
		System.out.println(reversed);
		
	}
}
