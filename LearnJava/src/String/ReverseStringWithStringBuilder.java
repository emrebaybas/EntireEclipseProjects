package String;

public class ReverseStringWithStringBuilder {

	public static void main(String[] args) {
		
		
		
		String toReverse = "Emre Baybas"; 
		  
        StringBuilder reversed = new StringBuilder();  		//create a StringBuilder object
  
        reversed.append(toReverse);  		  // append a string into StringBuilder 
        reversed = reversed.reverse(); 			   // reverse StringBuilder input1 
        
        System.out.println(reversed); 
        
	}

}
