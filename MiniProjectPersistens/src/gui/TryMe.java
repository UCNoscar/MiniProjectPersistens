package gui;

import ctrl.DataAccessException;
import db.CustomerDB;
import db.CustomerDBIF;
import db.ProductDB;
import db.ProductDBIF;
import model.Customer;
import model.Product;

public class TryMe {

	public static void main(String[] args) throws DataAccessException {
		ProductDBIF pIF = new ProductDB();
		
		CustomerDBIF cIF = new CustomerDB();

		System.out.println("succes");

		Product p = pIF.findProductByBarcode("1234", false);
		
		Customer c = cIF.findCustomerByPhone("12345678");
		
		System.out.println(p.toString());
		
		System.out.println(c.toString());
	}
}
