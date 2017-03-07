package test;

import org.junit.Test;

import controller.RestaurantController;
import junit.framework.Assert;

public class RestaurantTest {

	@Test
	public void testTheRestaurant()
	{
		RestaurantController controller = new RestaurantController();
		
		//1. We should initially have no items in the menu
		Assert.assertEquals(0, controller.getNoOfItemsOnMenu());
		
		//2. We load from the file with the initial four menu items		
		controller.loadFromFile();
		
		//Once we have loaded from file our system should contain four menu items
		Assert.assertEquals(4, controller.getNoOfItemsOnMenu());
		
		
		//3. Add two more items to the model on top of the original four loaded.
		controller.addItemToMenu("Cake", 5);
		controller.addItemToMenu("Coffee", 2);
		
		//We should now have six items in our model		
		Assert.assertEquals(6, controller.getNoOfItemsOnMenu());
				
		controller.saveToFile();
		//We should now have six lines in our file if we examine it.
		
		
		//4. We clear our model, so should be back to zero (in our model)
		controller.clearMenu();
		Assert.assertEquals(0, controller.getNoOfItemsOnMenu());
		
		//5. Load the file again (which this time has six in it, because we saved after adding the 
		//additional two items)
		controller.loadFromFile();	
		Assert.assertEquals(6, controller.getNoOfItemsOnMenu());
	}
	
}
