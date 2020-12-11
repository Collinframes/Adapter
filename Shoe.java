/**
 * Written by Collin Frames 12/1/20
 */

package csce247.assignments.adapter;

public class Shoe implements ShoeListing {

	private String brand;
	private String name;
	private double cost;
	private String description;
	
	public Shoe(String brand, String name, double price, String description)
	{
		this.brand = brand;
		this.name = name;
		cost = price;
		this.description = description;
	}
	
	public String toString()
	{
		String shoe = "";
		shoe = shoe + "Shoe: " + name;
		shoe = shoe + "By: " + brand;
		shoe = shoe + "Details: " + description;
		shoe = shoe + "Cost: $" + cost;
		return shoe;
	}
}



