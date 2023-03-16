package db;

import java.util.List;

import ctrl.DataAccessException;
import model.Customer;


public interface CustomerDBIF {

	List<Customer> findAllPS() throws DataAccessException;
	public Customer findCustomerByPhone(String phone) throws DataAccessException;
	
}
