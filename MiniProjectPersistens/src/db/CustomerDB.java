package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public List<Customer> findAllPS() throws DataAccessException{
		try {
			ResultSet rs = findAllPS.executeQuery();
			List<Customer> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException("Could not find all", e);
			throw he;
		}
	
	}
	
	private List<Customer> buildObjects(ResultSet rs) throws SQLException {
		List<Customer> res = new ArrayList<>();
		while(rs.next()) { 
			res.add(buildObject(rs));
		}
		return res;
	}

	//select name, phoneno, email

	private Customer buildObject(ResultSet rs) throws SQLException {
		Customer c = new Customer(
				rs.getString("name"),
				rs.getString("phoneno"),
				rs.getString("email"), 
				null
				);
		return c;
	}

	@Override
	public Customer findCustomerByPhone(String phone) throws DataAccessException {
		try {
			findByPhonePS.setString(1, phone);
			ResultSet rs = findByPhonePS.executeQuery();
			Customer c = null;
			if(rs.next()) {
				c = buildObject(rs);
			}
			return c;
		} catch (SQLException e) {
			throw new DataAccessException("Could not find by phoneno = " + phone, e);
		}
	}

}
