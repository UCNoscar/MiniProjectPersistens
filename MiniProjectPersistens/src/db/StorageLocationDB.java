package db;
import java.sql.PreparedStatement;

import model.Product;
import model.StorageLocation;
public class StorageLocationDB implements StorageLocationDBIF{

	private static final String FIND_ALL_Q = "select name, address_id from StorageLocation";
	private PreparedStatement findAllPS;

	private static String FIND_BY_ID_Q = FIND_ALL_Q + " where id = ?";
	private PreparedStatement findByIDPS;

	private static String FIND_BY_PHONE_Q = FIND_ALL_Q + "where phone = ?;";
	private PreparedStatement findByPhonePS;
	
	@Override
	public StorageLocation findStorageLocationByProduct(Product product) {

		return null;
	}


}
