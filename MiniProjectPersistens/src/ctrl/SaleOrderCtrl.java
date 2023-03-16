package ctrl;

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
	private int salesNo = 1;
	
	public SaleOrderCtrl() throws DataAccessException {
		pc = new ProductCtrl();
		cc = new CustomerCtrl();
	}
	
	private SaleOrderLine addProductToOrder(String barcode, int quantity) {
		Product p = pc.findProductByBarcode(barcode);
		SaleOrderLine sol = new SaleOrderLine(quantity, p, currOrder);
		calculateTotal(currOrder);
		return sol;
	}
	
	private Customer findCustomerByPhone(String phone)throws DataAccessException {
		tempCustomer = cc.findCustomerByPhone(phone);
		currOrder.setCustomer(tempCustomer);
		return tempCustomer;
	}

	private void calculateTotal(SaleOrder saleOrder) {
		 	int quantity = saleOrder.getSOLs().get(saleOrder.getSOLs().size()).getQuantity();
			double price = saleOrder.getSOLs().get(saleOrder.getSOLs().size()).getProduct().getSalesPrice().getPrice();
			double subTotal = quantity * price;
			currOrder.setTotal(currOrder.getTotal()+subTotal);
		
		
		}
	

	private void confirmCustomer() {
		currCustomer = tempCustomer;
	}
	
	private void confirmOrder() {
		"insert into SaleOrder(no, date, total, deliveryStatus, customer_id) values (?, ?, ?, ?, ?);"
		salesNo++;
	}
}