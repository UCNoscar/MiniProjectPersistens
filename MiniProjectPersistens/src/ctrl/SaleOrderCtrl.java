package ctrl;

import db.SaleOrderDB;
import db.SaleOrderDBIF;
import model.Customer;
import model.Product;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleOrderCtrl {

	private SaleOrder currOrder;
	private Customer currCustomer;
	private ProductCtrl pc;
	private CustomerCtrl cc;
	private Customer tempCustomer;
	private SaleOrderDBIF saleOrderDBIF;

	public SaleOrderCtrl() throws DataAccessException {
		pc = new ProductCtrl();
		cc = new CustomerCtrl();
		saleOrderDBIF = new SaleOrderDB();
	}

	public SaleOrderLine addProductToOrder(String barcode, int quantity) throws DataAccessException {
		if(currOrder == null) {
			currOrder = new SaleOrder();
		}
		Product product = pc.findProductByBarcode(barcode, false);
		SaleOrderLine sol = new SaleOrderLine(quantity, product, currOrder);
		calculateTotal(currOrder);
		return sol;
	}

	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		tempCustomer = cc.findCustomerByPhone(phone);
		return tempCustomer;
	}

	public void calculateTotal(SaleOrder saleOrder) {
//		int quantity = saleOrder.getSOLs().get(saleOrder.getSOLs().size()).getQuantity();
//		double price = saleOrder.getSOLs().get(saleOrder.getSOLs().size()).getProduct().getSalesPrice().getPrice();
//		double subTotal = quantity * price;
		currOrder.setTotal(currOrder.getTotal() + 20.2);
		
	}

	public void confirmCustomer() {
		currCustomer = tempCustomer;
		tempCustomer = null;
		currOrder.setCustomer(currCustomer);
	}

	public void confirmOrder() throws DataAccessException {
		saleOrderDBIF.persistSaleOrder(currOrder);
		currOrder = null;
	}
}