package model;

public class SaleOrderLine {
	private int quantity;
	private Product product;
	private SaleOrder saleOrder;

	public SaleOrderLine(int quantity, Product product, SaleOrder saleOrder) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.saleOrder = saleOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
