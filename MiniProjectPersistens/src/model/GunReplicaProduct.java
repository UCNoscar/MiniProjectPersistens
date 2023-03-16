package model;

public class GunReplicaProduct extends Product {
	private String calibre;
	private String material;

	public GunReplicaProduct(String barcode, String name, double purchasePrice, SalesPrice salesPrice, double rentPrice,
			String countryOfOrigin, int minStock, int quantity, String calibre, String material, int id) {
		super(barcode, name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, quantity, id);
		this.calibre = calibre;
		this.material = material;
	}

}
