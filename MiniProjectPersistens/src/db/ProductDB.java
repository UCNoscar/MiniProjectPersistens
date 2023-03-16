package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import ctrl.DataAccessException;
import model.ClothingProduct;
import model.EquipmentProduct;
import model.GunReplicaProduct;
import model.Product;
import model.SalesPrice;

public class ProductDB implements ProductDBIF {

	private static final String FIND_ALL_Q = "select * from Product "
			+ "left outer join ClothingProduct on product.id = ClothingProduct.product_id "
			+ "left outer join EquipmentProduct on product.id = EquipmentProduct.product_id "
			+ "left outer join GunReplicaProduct on product.id = GunReplicaProduct.product_id";
	private PreparedStatement findAllPS;

	private static String FIND_BY_BARCODE_Q = FIND_ALL_Q + " where barcode = ?;";
	private PreparedStatement findByBarcodePS;

	public ProductDB() throws DataAccessException {
		init();
	}

	private void init() throws DataAccessException {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			findAllPS = connection.prepareStatement(FIND_ALL_Q);
			findByBarcodePS = connection.prepareStatement(FIND_BY_BARCODE_Q);
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new DataAccessException(DBMessages.COULD_NOT_PREPARE_STATEMENT, e);
		}
	}

	@Override
	public Product findProductByBarcode(String barcode, boolean fullAssotiation) throws DataAccessException {
		Product foundProduct = null;
		try {
			findByBarcodePS.setString(1, barcode);
			ResultSet rs = findByBarcodePS.executeQuery();
			if (rs.next()) {
				foundProduct = buildProduct(rs, fullAssotiation);
			}
		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_BIND_OR_EXECUTE_QUERY, e);
		}

		return foundProduct;
	}

	private Product buildProduct(ResultSet rs, boolean fullAssotiation) throws DataAccessException {
		Product res = null;
		try {
			String type = rs.getString("type").toLowerCase();

			switch (type) {
			case ("clothing"):
				res = new ClothingProduct(rs.getString("barcode"), rs.getString("name"), rs.getDouble("purchasePrice"),
						new SalesPrice(), rs.getDouble("rentPrice"), rs.getString("countryOfOrigin"),
						rs.getInt("minStock"), rs.getInt("quantity"), rs.getString("size"), rs.getString("color"),
						rs.getInt("id"));

				break;
			case ("equipment"):
				res = new EquipmentProduct(rs.getString("barcode"), rs.getString("name"), rs.getDouble("purchasePrice"),
						new SalesPrice(), rs.getDouble("rentPrice"), rs.getString("countryOfOrigin"),
						rs.getInt("minStock"), rs.getInt("quantity"), rs.getString("type"), rs.getString("description"),
						rs.getInt("id"));
				break;
			case ("gun replica"):
				res = new GunReplicaProduct(rs.getString("barcode"), rs.getString("name"),
						rs.getDouble("purchasePrice"), new SalesPrice(), rs.getDouble("rentPrice"),
						rs.getString("countryOfOrigin"), rs.getInt("minStock"), rs.getInt("quantity"),
						rs.getString("calibre"), rs.getString("material"), rs.getInt("id"));
				break;
			default:
				System.out.println("Could not build product");
			}

		} catch (SQLException e) {
			throw new DataAccessException(DBMessages.COULD_NOT_READ_RESULTSET, e);
		}
		return res;
	}

	@Override
	public Boolean updateStockWithProductQuantity(Product product, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean reserveProductQuantity(Product product, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}
