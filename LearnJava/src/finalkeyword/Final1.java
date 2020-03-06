package finalkeyword;

public class Final1 {
	
	final	int speed=40;
	

	public static void main(String[] args) {
	
		Final1 f1=new Final1();
	//	f1.speed=100;    // because you defined speed final thats why you cannot change it. Remove the comment see it'll give error
		
		System.out.println(f1.speed);
		
		
	}
}
