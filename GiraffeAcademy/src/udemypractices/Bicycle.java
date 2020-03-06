package udemypractices;

public class Bicycle extends Vehicle {

	int numGears;
	
	public Bicycle(int s,int w,int g) {
		maxSpeed=s;
		numWheels=w;
		numGears=g;
	}
	
	public Bicycle() {
		this(0,0,0);
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	@Override
	public String toString() {
		return "Bycyle [numGears=" + numGears + ", maxSpeed=" + maxSpeed + ", numWheels=" + numWheels + "]";
	}
	
}
