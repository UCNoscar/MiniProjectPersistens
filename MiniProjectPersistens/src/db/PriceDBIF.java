package db;

public interface PriceDBIF {

	public Price findPriceByProduct(Product product, boolean fullAssotiation);
}
