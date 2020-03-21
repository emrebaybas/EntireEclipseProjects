package inheritance;

 class A {            // Parent Class
 
		protected int emre=30;
 int a;
 
 void display() {
	 System.out.println(a);
	 
    }
 }
//------------------------------------------------------------------------------------------
 
 class B extends A{         // Child Class of A
	 
	 int b;
	 
	 void print() {
		 System.out.println(b);
		
	 }
 }
public class Inheritance1  {
	public static void main(String[] args) {
	
		A o1=new A();
		o1.a=100;
		o1.display();

		B o2=new B();
		o2.a=150;
		o2.b=200;
		o2.display();
		o2.print();
		
		o1.display(); // if you declare static int a instead of int a, anytime you change a in another class it changes in the main class A as well
								// if its just int a you can give different values for a in all the classes itll store different values in different classes.
	}
}
