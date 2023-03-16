package ctrl;

import db.StorageLocationDBIF;
import model.Product;
import model.StorageLocation;

public class StorageLocationCtrl {
	private StorageLocationDBIF slDBIF;
	public StorageLocation findStorageLocationByProduct(Product product) {
		StorageLocation res = null;
		
		res = slDBIF.findStorageLocationByProduct(product);
		
		return res;
	}
}
