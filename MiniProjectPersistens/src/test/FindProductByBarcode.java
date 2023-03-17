package test;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ctrl.DataAccessException;
import ctrl.ProductCtrl;
import model.Product;

public class FindProductByBarcode {
	
	ProductCtrl pCtrl;
	Product p;
	
	@Before
	public void setUp() throws DataAccessException {
		pCtrl = new ProductCtrl();
	}
	
	@Test
	public void findProductByBarcode() {
		
	}

}
