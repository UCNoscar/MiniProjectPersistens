package model;

public class StorageLocationLine {
	private int quantity;
	private Product Product;
	private StorageLocation StorageLocation;
	
	public StorageLocationLine(int quantity, Product product, StorageLocation storageLocation) {
		super();
		this.quantity = quantity;
		Product = product;
		StorageLocation = storageLocation;
	}
	

	
}
