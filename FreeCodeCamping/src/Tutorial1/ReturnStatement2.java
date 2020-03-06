package Tutorial1;

public class ReturnStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it will just print the return value
		System.out.println(myString ( "what's up" ) );
		
		
		//Even though, i entered myBoolean false it still will print return value true
		System.out.println(myBoolean(false));

	}

	
	public static String myString(String name) {
		
		return "Selam bulusalim mi?";
	}
	
	public static boolean myBoolean(boolean correctName) {
		
		return true;
		
	}
}
