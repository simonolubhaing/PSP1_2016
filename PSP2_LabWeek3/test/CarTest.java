package test;

import org.junit.Test;

import controller.CarSystemController;
import controller.SystemMessages;
import junit.framework.Assert;
import model.Car;

public class CarTest 
{	
	@Test
	public void testMaxNumberOfCars()
	{
		CarSystemController carController = new CarSystemController();
		
		for(int i=0; i<CarSystemController.MAX_NO_OF_CARS; i++)
		{
			String result = carController.addCar("ford", "fiesta", 2015);
			Assert.assertEquals(SystemMessages.CAR_ADD_SUCCESSFUL, result);
		}
	}

	@Test
	public void testMoreThanMaxNumberOfCars()
	{
		CarSystemController carController = new CarSystemController();
		
		for(int i=0; i<CarSystemController.MAX_NO_OF_CARS; i++)
		{
			String result = carController.addCar("ford", "fiesta", 2015);
			Assert.assertEquals(SystemMessages.CAR_ADD_SUCCESSFUL, result);
		}
		
		//Try to add a 21st car
		String result = carController.addCar("ford", "fiesta", 2015);
		Assert.assertEquals(SystemMessages.CAR_SYSTEM_FULL, result);
	}
	@Test
	public void testBlankCarMake()
	{
		CarSystemController carController = new CarSystemController();
		String result = carController.addCar("", "fiesta", 2015);
		Assert.assertEquals(SystemMessages.CAR_MAKE_IS_BLANK, result);
	}
	
	@Test
	public void testThatDataWasAddedCorrectly()
	{
		CarSystemController carController = new CarSystemController();
		String result = carController.addCar("vw", "golf", 2010);
		Assert.assertEquals(SystemMessages.CAR_ADD_SUCCESSFUL, result);
		
		//Check that there is one car in the system
		Assert.assertEquals(1, carController.getNoOfCarsInSystem());
		
		Car[] theCars = carController.getCars();
		
		Car firstCar = theCars[0];
		Assert.assertEquals("vw", firstCar.getMake());
		Assert.assertEquals("golf", firstCar.getModel());
		Assert.assertEquals(2010, firstCar.getYear());
		
		
	}

}
