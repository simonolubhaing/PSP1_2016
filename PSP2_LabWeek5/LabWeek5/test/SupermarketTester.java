package test;

import java.util.ArrayList;

import org.junit.Test;

import controller.SupermarketController;
import junit.framework.Assert;
import model.Product;

public class SupermarketTester {

	@Test
	public void testTheSupermarket()
	{
		SupermarketController controller = new SupermarketController();
		controller.addProduct("apple tart", 1.50, "abc123", 25);
		controller.addProduct("apple juice", 2.50, "abc456", 150);
		controller.addProduct("bread", 1.74, "abc789", 200);
		
		int actualNoOfProductsInSupermarket = controller.getNoOfProducts();
		Assert.assertEquals(3, actualNoOfProductsInSupermarket);
		
		controller.removeProduct("abc789");
		actualNoOfProductsInSupermarket = controller.getNoOfProducts();
		Assert.assertEquals(2, actualNoOfProductsInSupermarket);
		
		
		ArrayList<Product> appleRelatedProducts =  controller.searchForProduct("apple");
		Assert.assertEquals(2, appleRelatedProducts.size());
		
		ArrayList<Product> bananaRelatedProducts = controller.searchForProduct("banana");
		Assert.assertEquals(0, bananaRelatedProducts.size());
	}
	
}
