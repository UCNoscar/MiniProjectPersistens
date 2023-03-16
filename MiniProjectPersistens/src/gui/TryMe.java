package gui;

import ctrl.DataAccessException;
import db.ProductDB;
import db.ProductDBIF;
import model.Product;

public class TryMe {

	public static void main(String[] args) throws DataAccessException {
		ProductDBIF pIF = new ProductDB();

		System.out.println("succes");

		Product p = pIF.findProductByBarcode("1111", false);
		
		System.out.println(p.toString());
	}
}
