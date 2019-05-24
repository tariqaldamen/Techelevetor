package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	
	
    public Company() {
	
    	System.out.println(name+ "mkmklmkl");
	}

	public String getCompanySize()
    {
    	if(numberOfEmployees<=50)
    	{
    		return "small";
    	}
    	else if(numberOfEmployees >= 51 && numberOfEmployees <= 250)
    	{
    		return "medium";
    	}
		else if (numberOfEmployees > 250) {
			return "large";
		}
		return null;
	}
    
    public double getProfit()
    {
    	
    	return revenue-expenses;
    	
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}
}
