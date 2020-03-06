package p1;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseFinally {

	public static void main(String[] args) {
	
		NumberFormat format =NumberFormat.getCurrencyInstance();
		
		String s;
		Number num;
		
		//s="$45.67";
		s="Hello There";
		
		try {
			num= format.parse(s);
			System.out.println("Float Value= " + num.floatValue());
		}
		catch(ParseException e) {
			System.err.println("Invalid String \"" + s+ "\"");
		}
		catch(Exception e) {
			System.err.println("Invalid Entry");
		}
		finally {
			System.out.println("Original string was \"" + s+ "\"");
		}
		
	}
}
