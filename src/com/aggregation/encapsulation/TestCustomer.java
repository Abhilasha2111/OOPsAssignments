package com.aggregation.encapsulation;

public class TestCustomer 
{
	public static void main(String[] args) 
	{
    Customer customerobj1 = new Customer("John",new Address("Ist Main HSR Layout","Banglore"),new Address("Ist Main Electronics city", "Bangalore"));
		
		customerobj1.getCustomerDetails();
}
}
