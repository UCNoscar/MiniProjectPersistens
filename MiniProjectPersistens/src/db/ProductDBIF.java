package db;
import ctrl.DataAccessException;
import model.*;

public interface ProductDBIF {

	public Product findProductByBarcode(String barcode, boolean fullAssotiation) throws DataAccessException;
	public Boolean updateStockWithProductQuantity(Product product, int quantity);
	public Boolean reserveProductQuantity(Product product, int quantity);
}
