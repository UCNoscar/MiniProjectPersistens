package ctrl;

import java.sql.SQLException;

import db.CustomerDB;
import db.CustomerDBIF;
import model.Customer;

public class CustomerCtrl {

	public CustomerCtrl() throws DataAccessException {

	}

	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		CustomerDBIF customerDBIF = new CustomerDB();
		return customerDBIF.findCustomerByPhone(phone);
	}
}
