package com.aggregation.encapsulation;

public class Address 
{
	String addressLine;
	String city;
    public Address(String addressLine, String city) 
	{
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressDetails() 
	{
	return addressLine+" "+city;
	}
}
