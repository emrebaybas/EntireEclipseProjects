package Tutorial1;

public class dailyRainfall {

	public static void main(String[] args) {

		double[] dailyRainfall = { 1, 2, 0, 0, 5, 1, 0 };

		System.out.println("Total Rainfall of the Week: " + (dailyRainfall[0] + dailyRainfall[1] + dailyRainfall[2]
				+ dailyRainfall[3] + dailyRainfall[4] + dailyRainfall[5] + dailyRainfall[6]));

		System.out.println("Avarage Rainfall of the Week: " + (dailyRainfall[0] + dailyRainfall[1] + dailyRainfall[2]
				+ dailyRainfall[3] + dailyRainfall[4] + dailyRainfall[5] + dailyRainfall[6]) / 7);

	}

}
