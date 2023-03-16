package ctrl;

import db.ProductDB;
import db.ProductDBIF;
import model.Product;

public class ProductCtrl {
	private ProductDBIF productDBIF;

	public ProductCtrl() throws DataAccessException {
		productDBIF = new ProductDB();
	}

	public Product findProductByBarcode(String barcode, Boolean fullAssotiation) throws DataAccessException {
		Product res = null;
		
		res = productDBIF.findProductByBarcode(barcode, fullAssotiation);
		
		return res;

	}
//	+ updateStockWithProductQuantity(product: Product, quantity: int): boolean
//	+ reserveProductQuantity(product: Product, quantity: int)
}
