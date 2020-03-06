package Tutorial1;

public class UsingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets say we have a story and we want to define some variables in the story
		//So story can be easily updated by changing the variables

		
		String NameIs= "Kenan";
		int AgeIs= 33 ;
		double PortionIs= 1.5;
		
		
		
		System.out.println("My best friend's name is " + NameIs+ " and he is " + AgeIs +" years old");
		System.out.println("He usually  likes to eat  " + PortionIs+ " iskender " );
		System.out.println(NameIs +" was living in Toprak Kent with his wife and daugther" );
		System.out.println("However being  " + AgeIs + " years old, he did not see any reason not to move back close to family");
		
		//lets say in the story he became 34
		//wherever we define variable, java will only apply after lines not before
		//lets add a line after updating AgeIs=34 
		
		AgeIs=34;
		
		System.out.println("Two weeks after he moved back, He turned " + AgeIs);
		
		
	}

}
