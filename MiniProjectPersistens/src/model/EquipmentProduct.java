package model;

public class EquipmentProduct extends Product{
	private String type;
	private String description;
	
	
	
	public EquipmentProduct(String barcode, String name, double purchasePrice, SalesPrice salesPrice, double rentPrice,
			String countryOfOrigin, int minStock, int quantity, String type, String description, int id) {
		super(barcode, name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, quantity, id);
		this.type = type;
		this.description = description;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	
}

