package db;
import model.Product;
public interface StorageLocationDBIF {

	public StorageLocation findStorageLocationByProduct(Product product);
	
}
