package oops_objectorientedprogrammingsystem;

public class DefaultConstructor {

	
	int x;
	int y;
	
	
	DefaultConstructor (){
		x=10;
		y=20;
	}
	
	DefaultConstructor (int a,int b){
		//first field names x,y  then = a,b it doesn't work it you do a=x it has to be x=a
	x=a;
	y=b;
	}
	
	@Override
	public String toString() {
		return "DefaultConstructor [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		
		DefaultConstructor c1= new DefaultConstructor();
		DefaultConstructor c2= new DefaultConstructor(50,60);
	
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
