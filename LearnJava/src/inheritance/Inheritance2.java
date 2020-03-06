package inheritance;

class C {
	int c;

	void display() {
		System.out.println(c);
	}
}

class D extends C {
	int d;

	void print() {
		System.out.println(d);
	}
}

class E extends D {
	
	int e;

	void show() {
		System.out.println(e);
	}
}


public class Inheritance2 {

	public static void main(String[] args) {

		E o1=new E();
		o1.c=10;
		o1.d=20;
		o1.e=30;
		
		o1.display();
		o1.print();
		o1.show();
		
	}
}
