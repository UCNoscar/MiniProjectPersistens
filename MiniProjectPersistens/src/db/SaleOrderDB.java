package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import ctrl.DataAccessException;
import model.SaleOrder;

public class SaleOrderDB implements SaleOrderDBIF {

	private static String INSERT_ORDER_TO_DATABASE_Q = "insert into SaleOrder(date, total, deliveryStatus, customer_id) values (GETDATE(), ?, ?, ?);";
	private PreparedStatement insertOrderToDatabasePS;

	public SaleOrderDB() throws DataAccessException {
		init();
	}

	private void init() throws DataAccessException {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			insertOrderToDatabasePS = connection.prepareStatement(INSERT_ORDER_TO_DATABASE_Q);
		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_PREPARE_STATEMENT, e);
		}
	}

	@Override
	public Boolean persistSaleOrder(SaleOrder saleOrder) throws DataAccessException {
		boolean res = false;
		try {

			insertOrderToDatabasePS.setDouble(1, saleOrder.getTotal());
			insertOrderToDatabasePS.setInt(2, 0);
			insertOrderToDatabasePS.setInt(3, saleOrder.getCustomer().getId());

			ResultSet rs = insertOrderToDatabasePS.executeQuery();
			if (rs != null) {
				res = true;
			}
		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_BIND_OR_EXECUTE_QUERY, e);
		}
		return res;
	}

}
