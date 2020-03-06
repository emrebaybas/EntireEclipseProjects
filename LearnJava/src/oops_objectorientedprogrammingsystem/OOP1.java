package oops_objectorientedprogrammingsystem;

public class OOP1 {
	
	//class =collection of variables and methods
	//object= instance of a class
	//method= block of codes which executes a function
	
	int eId;
	String eName;
	double eSalary;
	int depNumber;
	String jobTitle;
	
	void display() {
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eSalary);
		System.out.println(depNumber);
		System.out.println(jobTitle);
		System.out.println();
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depNumber;
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(eSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OOP1 other = (OOP1) obj;
		if (depNumber != other.depNumber)
			return false;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (Double.doubleToLongBits(eSalary) != Double.doubleToLongBits(other.eSalary))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		OOP1 emp1=new OOP1();
		emp1.eId=100;
		emp1.eName="Emre";
		emp1.eSalary=6000;
		emp1.depNumber=10;
		emp1.jobTitle="Sofware Developer";
		emp1.display();
		
		OOP1 emp2=new OOP1();
		emp2.eId=101;
		emp2.eName="Stephen";
		emp2.eSalary=8000;
		emp2.depNumber=10;
		emp2.jobTitle="Sofware Developer";
		emp2.display();
		
	}

}
