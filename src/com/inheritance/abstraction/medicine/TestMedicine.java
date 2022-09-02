package com.inheritance.abstraction.medicine;

public class TestMedicine 
{
	public static void main(String[] args) 
	{
		Medicine m[] = new Medicine[5];
	double i = Math.random()*4;
	
	int j = (int)i;
//	System.out.println(j);
	
	if(j==1) 
	{
		Tablet tablet = new Tablet();
		tablet.getDetails(50,"5-6-2024","Tablet");
		tablet.displayLabel();
		
	}
	else if(j==2) 
	{
		Syrup syrup = new Syrup();
		syrup.getDetails(100,"14-6-2020","Syrup");
		syrup.displayLabel();
	}
	else if(j==3) 
	{
		Ointment ointment = new Ointment();
		ointment.getDetails(70,"5-10-2023","Ointment");
		ointment.displayLabel();
	}else {
		System.out.println("Refresh to see the medicine details");
	}

	}
}
