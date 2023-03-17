package db;
import java.util.List;

import ctrl.DataAccessException;
import model.*;

public interface SaleOrderDBIF {

	public void persistSaleOrder(SaleOrder saleOrder) throws DataAccessException;

}
