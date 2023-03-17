package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ctrl.DataAccessException;
import ctrl.ProductCtrl;
import ctrl.SaleOrderCtrl;
import model.EquipmentProduct;
import model.SalesPrice;


public class addProductToOrderTest {
	
	SaleOrderCtrl soCtrl;
	EquipmentProduct p;
	SalesPrice sp;
	ProductCtrl pCtrl;
	
	@BeforeEach
	public void setUp() throws DataAccessException {
		soCtrl = new SaleOrderCtrl();
		sp = new SalesPrice();
		pCtrl = new ProductCtrl();
	}
	

	@Test
	public void shouldMakeSaleOrderLineWithObjectWithBarCode1234AndQuantityIsValid() throws DataAccessException {
		
		// Arrange
		
		
		// Act
		soCtrl.addProductToOrder("1234", 4);
			
		// Assert
		assertEquals(soCtrl.getCurrOrder().getSOLs().get(0).getProduct().getBarcode(), pCtrl.findProductByBarcode("1234").getBarcode());
		
	}


	
}