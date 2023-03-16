package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ctrl.DataAccessException;
import model.Product;
import model.SalesPrice;

public class PriceDB implements PriceDBIF {

	private static final String FIND_PRICE_BY_PRODUCT_Q = "select price from SalesPrice where Product.barcode = ?;";
	private PreparedStatement findPriceByProductPS;

	public PriceDB() throws DataAccessException {
		init();
	}

	private void init() throws DataAccessException {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			findPriceByProductPS = connection.prepareStatement(FIND_PRICE_BY_PRODUCT_Q);
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new DataAccessException(DBMessages.COULD_NOT_PREPARE_STATEMENT, e);
		}
	}

	@Override
	public SalesPrice findPriceByProduct(Product product, boolean fullAssotiation) {
		// TODO Auto-generated method stub
		return null;
	}

}
