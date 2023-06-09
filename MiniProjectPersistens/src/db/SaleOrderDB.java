package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import ctrl.DataAccessException;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleOrderDB implements SaleOrderDBIF {

	private static String INSERT_ORDER_TO_DATABASE_Q = "insert into SaleOrder(date, total, deliveryStatus, customer_id) values (GETDATE(), ?, ?, ?);";
	private PreparedStatement insertOrderToDatabasePS;

	private static String INSERT_ORDERLINE_TO_DATABASE_Q = "insert into SaleOrderLine(saleOrder_id, product_id, quantity, subTotal) values (?, ?, ?, ?);";
	private PreparedStatement insertOrderLineToDatabasePS;

	public SaleOrderDB() throws DataAccessException {
		init();
	}

	private void init() throws DataAccessException {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			insertOrderToDatabasePS = connection.prepareStatement(INSERT_ORDER_TO_DATABASE_Q, PreparedStatement.RETURN_GENERATED_KEYS);
			insertOrderLineToDatabasePS = connection.prepareStatement(INSERT_ORDERLINE_TO_DATABASE_Q);
		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_PREPARE_STATEMENT, e);
		}
	}

	@Override
	public void persistSaleOrder(SaleOrder saleOrder) throws DataAccessException {
		int id = -1;
		try {

			insertOrderToDatabasePS.setDouble(1, saleOrder.getTotal());
			insertOrderToDatabasePS.setInt(2, 0);
			insertOrderToDatabasePS.setInt(3, saleOrder.getCustomer().getId());
			id = DBConnection.getInstance().executeInsertWithIdentity(insertOrderToDatabasePS);

			persistSaleOrderLine(saleOrder, saleOrder.getSOLs(), id);
		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_BIND_OR_EXECUTE_QUERY, e);
		}
	}

	
	
	private void persistSaleOrderLine(SaleOrder currOrder, List<SaleOrderLine> soLs, int id) throws DataAccessException {

		try {

			for (SaleOrderLine sols : soLs) {
				insertOrderLineToDatabasePS.setInt(1, id);
				insertOrderLineToDatabasePS.setInt(2, sols.getProduct().getId());
				insertOrderLineToDatabasePS.setInt(3, sols.getQuantity());
				insertOrderLineToDatabasePS.setInt(4, (int) sols.getSubTotal());
				
				insertOrderLineToDatabasePS.executeUpdate();
			}

		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_BIND_OR_EXECUTE_QUERY, e);
		}
	}

}
