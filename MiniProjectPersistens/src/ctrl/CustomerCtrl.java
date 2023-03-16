package ctrl;

import java.sql.SQLException;

import db.CustomerDB;
import model.Customer;

public class CustomerCtrl {
	
	private CustomerDB customerDB;
	
	
	public CustomerCtrl() throws DataAccessException  {
			customerDB = new CustomerDB();
		
	}
	
	
	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		return customerDB.findCustomerByPhone(phone, false);
	}
}
