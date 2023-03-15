package model;

import java.util.List;

public abstract class Product {
	private String name;
	private double purchasePrice;
	private SalesPrice salesPrice;
	private double rentPrice;
	private String countryOfOrigin;
	private int minStock;
	private int quantity;
	private List<StorageLocationLine> SLLs;
	
	
	public Product(String name, double purchasePrice, SalesPrice salesPrice, double rentPrice, String countryOfOrigin, int minStock, int quantity) {
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.rentPrice = rentPrice;
		this.countryOfOrigin = countryOfOrigin;
		this.minStock = minStock;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	public SalesPrice getSalesPrice() {
		return salesPrice;
	}


	public void setSalesPrice(SalesPrice salesPrice) {
		this.salesPrice = salesPrice;
	}


	public double getRentPrice() {
		return rentPrice;
	}


	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}


	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}


	public int getMinStock() {
		return minStock;
	}


	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
