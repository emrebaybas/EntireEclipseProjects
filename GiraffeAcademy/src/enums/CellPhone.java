package enums;

public class CellPhone {

	public enum opSystem {
		IOS, ANDROID, WINDOWS
	}

	String brand;
	opSystem opSystem;
	int memory;
	int phoneNum;

	public String toString() {
		return "CellPhone [brand=" + brand + ", Operating System=" + opSystem + ", Memory of the phone=" 
	+ memory + ", Phone number associated with=" + phoneNum + "]";
	}

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.brand = "Samsung";
		p1.opSystem= p1.opSystem.ANDROID;
		p1.memory = 256;
		p1.phoneNum = 2025553344;

		System.out.println(p1.opSystem);
		System.out.println(p1);
	}

}
