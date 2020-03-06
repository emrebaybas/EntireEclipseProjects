package Tutorial1;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array is similiar to variable. With variables you can only store one single value
		//arrays are used to store large amount of values
		
		String [] friends = {"Jim","Karen","Kevin"};
		// arrays are indexed similiar to strings starts from 0,1,2
		//if i want to print jim i will enter friends[0]
		
		friends[0] = "Emre";
		
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		
		System.out.println(friends.length); // it'll say how many entries in the array 3
		
		
		for (String myFriends : friends) {
			System.out.println(myFriends);
		}
		
		
	}

}
