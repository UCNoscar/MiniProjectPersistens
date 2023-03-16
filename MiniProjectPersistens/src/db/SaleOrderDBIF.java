package db;
import ctrl.DataAccessException;
import model.*;

public interface SaleOrderDBIF {

	public Boolean persistSaleOrder(SaleOrder saleOrder) throws DataAccessException;
}
