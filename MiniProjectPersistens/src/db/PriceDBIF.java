package db;

import model.Product;
import model.SalesPrice;

public interface PriceDBIF {

	public SalesPrice findPriceByProduct(Product product, boolean fullAssotiation);
}
