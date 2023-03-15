package model;

public class ClothingProduct extends Product {
	private String size;
	private String colour;
	
	
	public ClothingProduct (String name, double purchasePrice, SalesPrice salesPrice, double rentPrice,
			String countryOfOrigin, int minStock, int quantity, String size, String colour) {
		super(name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, quantity);
		this.size = size;
		this.colour = colour;
		
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
