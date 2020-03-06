package oops_objectorientedprogrammingsystem;

public class Tesla {
	
	String model;
	double engineSize;
	String color;
	int maxSpeed;
	int year;
	
	@Override
	public String toString() {
		return "Tesla [model=" + model + ", engineSize=" + engineSize + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", year=" + year + "]";
	}
	public static void main(String[] args) {
		
		Tesla v1=new Tesla();
		v1.model="S";
		v1.engineSize=3.6;
		v1.color="white";
		v1.maxSpeed=180;
		v1.year=2018;
		
		Tesla v2=new Tesla();
		v2.model="X";
		v2.engineSize=3.6;
		v2.color="Grey";
		v2.maxSpeed=160;
		v2.year=2019;
		
		Tesla v3=new Tesla();
		v3.model="U";
		v3.engineSize=3.6;
		v3.color="Black";
		v3.maxSpeed=140;
		v3.year=2020;
		
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
		
	}
	
	
	

}
