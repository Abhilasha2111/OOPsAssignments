package com.encapsulation.inheritance;

public class EngineeringBook extends Book
{
	private String category;
	public void getBookDetails() {
		System.out.println("\n##############################################################");
		System.out.println("\nBook No:"+getBookNo());
		System.out.println("Book Title :"+getTitle());
		System.out.println("Book Author :"+getAuthor());
		System.out.println("Book Price : "+getPrice());
		System.out.println("Book Category :"+getCategory());
	}
    public String getCategory() 
    {
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}
}
