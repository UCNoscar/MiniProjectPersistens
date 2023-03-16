package db;
import java.util.List;

import ctrl.DataAccessException;
import model.*;

public interface SaleOrderDBIF {

	public int persistSaleOrder(SaleOrder saleOrder) throws DataAccessException;

	public void persistSaleOrderLine(SaleOrder currOrder, List<SaleOrderLine> soLs, int id) throws DataAccessException;
}
