package Tutorial1;

public class ModifyingStringsWithBackSplash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//   \b     \t     \n     \r     \"     \'      \\
		
		System.out.println("Emre Baybas");
		
		//If i want to print Last Name in another line, We use  backslash n  -->  \n or \r
		//if you use twice it leaves one line empty jump on the next line
		
		System.out.println("Emre \nBaybas");
		System.out.println("Emre \r\rBaybas");
		
		//If you want to use Quotation marks in your text you will use       "\" text\"
		
		System.out.println("Emre \"Baybas\"");
		
		//If you want to leave extra space        \t
		
		System.out.println("Emre \tBaybas");
		
		//if you use it twice, youll have a bigger space
		System.out.println("Emre \t\tBaybas");
			
		
		//if you want to use backslash  //
		System.out.println("Emre \\ Baybas");

	}

}
