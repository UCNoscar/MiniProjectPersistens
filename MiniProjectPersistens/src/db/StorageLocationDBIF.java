package db;
import model.Product;
import model.StorageLocation;
public interface StorageLocationDBIF {

	public StorageLocation findStorageLocationByProduct(Product product);
	
}
