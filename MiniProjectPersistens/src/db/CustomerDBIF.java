package db;

import java.util.List;

import ctrl.DataAccessException;
import model.Customer;


public interface CustomerDBIF {

	public List<Customer> findAll() throws DataAccessException;
	public Customer findCustomerByPhone(String phone) throws DataAccessException;
	
}
