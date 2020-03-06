package Tutorial1;

public class ForLoopEnhanced {
	public static void main(String[] args) {

		int num[] = { 1, 3, 5, 7, 9 };
//
//		for (int x : num) {
//			System.out.println(x);
//		}
		
		//shortcut is type foreach and ctrl+space enter
		//it will create an enhanced loop for you 
		
		for (int i : num) {
			System.out.println(i);
		}
	}
}
