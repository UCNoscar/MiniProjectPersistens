package ctrl;

import java.util.List;

import db.SaleOrderDB;
import db.SaleOrderDBIF;
import model.Customer;
import model.Product;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleOrderCtrl {

	private SaleOrder currOrder;
	private Customer currCustomer;

	public SaleOrderCtrl() {
	}

	public SaleOrderLine addProductToOrder(String barcode, int quantity) throws DataAccessException {
		ProductCtrl pc = new ProductCtrl();
		if (currOrder == null) {
			currOrder = new SaleOrder();
		}
		Product product = pc.findProductByBarcode(barcode);
		SaleOrderLine sol = new SaleOrderLine(quantity, product, currOrder);
		currOrder.addSaleOrderLine(sol);
		calculateTotal();
		return sol;
	}

	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		CustomerCtrl cc = new CustomerCtrl();
		currCustomer = cc.findCustomerByPhone(phone);
		return currCustomer;
	}

	public double calculateTotal() {
		for (int i = 1; i < currOrder.getSOLs().size(); i++) {
			double price = currOrder.getSOLs().get(i).getProduct().getSalesPrice().getPrice();
			double quantity = currOrder.getSOLs().get(i).getQuantity();
			double subTotal = price * quantity;
			currOrder.setTotal(currOrder.getTotal() + subTotal);
		}
		return currOrder.getTotal();
	}

	public void confirmCustomer() {
		if (currOrder == null) {
			currOrder = new SaleOrder();
		}
		currOrder.setCustomer(currCustomer);
	}

	public void confirmOrder() throws DataAccessException {
		SaleOrderDBIF saleOrderDBIF = new SaleOrderDB();
		saleOrderDBIF.persistSaleOrder(currOrder);
		currOrder = null;
	}

	public String printOrder() {
		return currOrder.printOrder();
	}

	public SaleOrder getCurrOrder() {
		return currOrder;
	}

	public void cancelOrder() {
		currOrder = null;
		currCustomer = null;
	}
}