package Tutorial1;

public class TripPrice {
	public static void main(String[] args) {

		int numPeople=4;
		double flightCost=687.45;
		double hotelCost= 423.55;
		double rentalCarCost= 180.00;
		double totalCostPerPerson=0;
		
		totalCostPerPerson += flightCost;
		totalCostPerPerson += hotelCost;
		totalCostPerPerson += rentalCarCost;
		
		System.out.println("Total Cost Per Person: " + totalCostPerPerson);
		
		totalCostPerPerson *= numPeople;
		
		System.out.println("Total Cost of Vocation: " + totalCostPerPerson);
		
	}
}
