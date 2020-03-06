package thiskeyword;

public class ThisKeyword1 {
	
	int a,b; //instance variable
	
	void getValues(int a, int b) {
		this.a=a;
		this.b=b;  // This keyword is a reference keyword to refer current instance variables.
	}
	void printValues() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword1 th=new ThisKeyword1();
		th.getValues(10,200);
		th.printValues();	
	}
}
