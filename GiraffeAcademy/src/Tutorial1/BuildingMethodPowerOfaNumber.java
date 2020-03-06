package Tutorial1;

public class BuildingMethodPowerOfaNumber {

	public static void main(String[] args) {

		System.out.println(power(2,3));
	}

	public static int power(int baseNum, int powerNum) {
		int result =1;
		
		for(int i=0;i<powerNum;i++) {
			
			result = result *baseNum; // first iteration result =1 
			//so result = result * baseNum --> result = 1* baseNum --> result = baseNum   if you put 2^1 it will be 2
			// Second time result=baseNum so if result is 2 for the second time it will be baseNum*baseNum and third time baseNum*baseNum*baseNum
		}
		return result;
	}
}
