package model;

public class ClothingProduct extends Product {
	private String size;
	private String colour;
	
	
	public ClothingProduct (String barcode, String name, double purchasePrice, SalesPrice salesPrice, double rentPrice,
			String countryOfOrigin, int minStock, int quantity, String size, String colour, int id) {
		super(barcode, name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, quantity, id);
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
