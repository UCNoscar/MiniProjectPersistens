package ctrl;

import model.Customer;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleOrderCtrl {

	private SaleOrder currOrder;
	private Customer currCustomer;
	private ProductCtrl pc;
	private CustomerCtrl cc;
	private Customer tempCustomer;
	
	public SaleOrderCtrl() {
		pc = new ProductCtrl();
		cc = new CustomerCtrl();
	}
	
	private SaleOrderLine addProductToOrder(String barcode, int quantity) {
		Product p = pc.findProductByBarcode(barcode);
		SaleOrderLine sol = new SaleOrderLine(quantity, p, currOrder);
		return sol;
	}
	
	private Customer findCustomerByPhone(String phone)throws dataAccessException {
		tempCustomer = cc.findCustomerByPhone(phone);
		currOrder.setCustomer(tempCustomer);
	}


	private void confirmCustomer() {
		currCustomer = tempCustomer;
	}
	
	private void confirmOrder() {
		
	}
}