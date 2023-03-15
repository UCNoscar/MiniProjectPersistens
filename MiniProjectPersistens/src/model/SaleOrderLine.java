package model;

public class SaleOrderLine {
	private int quantity;
	
	
	
	public SaleOrderLine (int quantity) {
		this.quantity = quantity;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
