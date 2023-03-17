package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ctrl.DataAccessException;
import ctrl.ProductCtrl;
import ctrl.SaleOrderCtrl;
import model.EquipmentProduct;
import model.Product;
import model.SalesPrice;


public class addProductToOrderTest {
	
	SaleOrderCtrl soCtrl;
	EquipmentProduct p;
	SalesPrice sp;
	
	@BeforeEach
	public void setUp() throws DataAccessException {
		soCtrl = new SaleOrderCtrl();
		sp = new SalesPrice();
		p = new EquipmentProduct("1234", "Barbells", 10, sp, 13, "BananaLand", 30, 200, "Lifting Equipment", "A set of 24 pound barbells", 4);
	}
	
	@Test
	public void shouldMakeSaleOrderLineWithBarbellsWhenBarcodeIs1234AndQuantityIsValid() throws DataAccessException {
		
		// Arrange
		
		
		// Act
		soCtrl.addProductToOrder("1234", 4);
			
		// Assert
		assertEquals("lol get rekt", p, soCtrl.getCurrOrder().getSOLs().get(0).getProduct());
		
	}


}