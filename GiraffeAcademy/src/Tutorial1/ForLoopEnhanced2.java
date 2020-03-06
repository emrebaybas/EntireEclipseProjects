package Tutorial1;

public class ForLoopEnhanced2 {

	public static void main(String[] args) {

		String classes[][] = { { "Math", "Physics", "Biology" }, 
				{ "Chemistry", "History", "Literature" },
				{ "English", "Art", "Materials" } };

		for (String[] a : classes) {
			for (String b : a) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		//short cut is type foreach ctrl+space+enter
		//then create the second loop manually
		for (String[] strings : classes) {
			for (String i : strings) {
				System.out.println(i);
			}
		}
	}
}
