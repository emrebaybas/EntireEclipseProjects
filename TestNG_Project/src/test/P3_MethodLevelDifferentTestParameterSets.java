package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P3_MethodLevelDifferentTestParameterSets {
	
	//We will test our mortgage application 
	//for 3 different customers 
	//First Good Credit Score Customer 
	//Okay Credit Score Customer
	//Bad Credit Score Customers
	
	@DataProvider
	public Object[][] getCustomerData() {
		System.out.println("");
		
		Object[][] customerData=new Object[3][2];
		
		customerData[0][0]="GoodCreditUsername";
		customerData[0][1]="GoodCreditPassword";
		
		customerData[1][0]="OkayCreditUsername";
		customerData[1][1]="OkayCreditPassword";
		
		customerData[2][0]="BadCreditUsername";
		customerData[2][1]="BadCreditPassword";
		return customerData;
		
	}
	
	@Test(dataProvider="getCustomerData")
	public void m0(String username,String password) {
		System.out.println("Hello");
		System.out.println(username);
		System.out.println(password);
		System.out.println("************");	
	}

	
}
