package ctrl;

import java.sql.SQLException;

import db.CustomerDB;
import db.CustomerDBIF;
import model.Customer;

public class CustomerCtrl {
	
	private CustomerDBIF customerDBIF;
	
	
	public CustomerCtrl() throws DataAccessException  {
			customerDBIF = new CustomerDB();
		
	}
	
	
	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		return customerDBIF.findCustomerByPhone(phone);
	}
}
