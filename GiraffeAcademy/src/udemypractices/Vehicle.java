package udemypractices;

public class Vehicle {

	
	
	int maxSpeed;
	int numWheels;
	
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", numWheels=" + numWheels + "]";
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public Vehicle(int s,int w) {
		maxSpeed=s;
		numWheels=w;
	}
	
	public Vehicle() {
		this(0,0);
	}
	
	
}
