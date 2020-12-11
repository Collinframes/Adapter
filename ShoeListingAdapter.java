/**
 * Written by Collin Frames 12/1/20
 */

package csce247.assignments.adapter;

public class ShoeListingAdapter implements ProductListing {

	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	public ShoeListingAdapter(ShoeListing shoe)
	{
		this.shoe = shoe;
	    this.title = this.shoe.toString().substring(this.shoe.toString().indexOf("Shoe: ") + "Shoe: ".length(), this.shoe.toString().indexOf("By: "));
        this.price = Double.parseDouble(this.shoe.toString().substring(this.shoe.toString().indexOf("$") + "$".length()));
        this.brand = this.shoe.toString().substring(this.shoe.toString().indexOf("By: ") + "By: ".length(), this.shoe.toString().indexOf("Details:"));
        this.description = this.shoe.toString().substring(this.shoe.toString().indexOf("Details: ") + "Details: ".length(), this.shoe.toString().indexOf("Cost: $"));
	}

	public String getTitle()
	{
		return this.title;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String getDescription()
	{
		return "Created by " + this.brand + ", " + this.description;
	}
}
