package ctrl;

import db.ProductDB;
import db.ProductDBIF;
import model.Product;

public class ProductCtrl {

	public ProductCtrl() throws DataAccessException {
	}

	public Product findProductByBarcode(String barcode) throws DataAccessException {
		ProductDBIF productDBIF = new ProductDB();
		
		Product res = null;
		res = productDBIF.findProductByBarcode(barcode);
		return res;

	}
	// TODO: implementer følgende metoder
	// + updateStockWithProductQuantity(product: Product, quantity: int): boolean
	// + reserveProductQuantity(product: Product, quantity: int)
}
