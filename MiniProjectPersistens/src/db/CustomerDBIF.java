package db;

import model.Customer;

public interface CustomerDBIF {

	public Customer findCustomerByPhone(String Phone, boolean fullassotiation);
	
}
