package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ctrl.DataAccessException;
import model.Customer;

public class CustomerDB implements CustomerDBIF {

	private static final String FIND_ALL_Q = "select name, phoneno, email from Customer";
	private PreparedStatement findAllPS;

	private static String FIND_BY_ID_Q = FIND_ALL_Q + " where id = ?";
	private PreparedStatement findByIDPS;

	private static String FIND_BY_PHONE_Q = FIND_ALL_Q + "where phone = ?;";
	private PreparedStatement findByPhonePS;

	public CustomerDB() throws DataAccessException {
		init();
	}
	
	private void init() throws DataAccessException {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			findAllPS = connection.prepareStatement(FIND_ALL_Q);
			findByIDPS = connection.prepareStatement(FIND_BY_ID_Q);
			findByPhonePS = connection.prepareStatement(FIND_BY_PHONE_Q);
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new DataAccessException(DBMessages.COULD_NOT_PREPARE_STATEMENT, e);
		}
	}
	
		
	@Override
	public Customer findCustomerByPhone(String Phone, boolean fullassotiation) {
		// TODO Auto-generated method stub
		return null;
	}

}
