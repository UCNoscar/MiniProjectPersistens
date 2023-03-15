package model;

public class GunReplicaProduct extends Product {
	private String calibre;
	private String material;

	public GunReplicaProduct(String name, double purchasePrice, SalesPrice salesPrice, double rentPrice,
			String countryOfOrigin, int minStock, int quantity, String calibre, String material) {
		super(name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, quantity);
		this.calibre = calibre;
		this.material = material;
	}

}
