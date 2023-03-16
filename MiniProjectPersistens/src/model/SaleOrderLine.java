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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public SaleOrder getSaleOrder() {
		return saleOrder;
	}

	public void setSaleOrder(SaleOrder saleOrder) {
		this.saleOrder = saleOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
