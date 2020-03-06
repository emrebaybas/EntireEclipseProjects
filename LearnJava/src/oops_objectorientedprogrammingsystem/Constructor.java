package oops_objectorientedprogrammingsystem;

public class Constructor {

	int bankerId;
	String bankerName;
	int salary;
	
	Constructor (int id,String name,int sal){
		bankerId=id;
		bankerName=name;
		salary=sal;
	}
	
	Constructor (){
		this(0," ",0);
	}
	
	@Override
	public String toString() {
		return "Constructor [bankerId=" + bankerId + ", bankerName=" + bankerName + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		Constructor b1=new Constructor(100,"Haci Osman",65000);
		Constructor b2=new Constructor();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
