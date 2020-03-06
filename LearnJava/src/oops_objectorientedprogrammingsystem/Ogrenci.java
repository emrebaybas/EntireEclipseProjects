package oops_objectorientedprogrammingsystem;

public class Ogrenci {

	int studentId;
	String studentName;
	char grade;

	@Override
	public String toString() {
		return "Ogrenci [studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade + "]";
	}

	void getValues(int id, String name, char grd) {
		//getValues method makes it easier to enter values in one line
		// make sure you first write your field names then = new variable names
		studentId = id;
		studentName = name;
		grade = grd;
	}

	public static void main(String[] args) {

		Ogrenci s1 = new Ogrenci();
		s1.getValues(100, "emre", 'A');
		System.out.println(s1.toString());

	}
}
