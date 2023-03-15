package db;
import model.*;

public interface ProductDBIF {

	public Product findProductByBarcode(String barcode, boolean fullAssotiation);
	public Boolean updateStockWithProductQuantity(Product product, int quantity);
	public Boolean reserveProductQuantity(Product product, int quantity);
}
