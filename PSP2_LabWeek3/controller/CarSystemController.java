package controller;

import model.Car;

public class CarSystemController {

	public static final int MAX_NO_OF_CARS = 20;
	
	private Car[] theCars;
	private int noOfCarsInSystem = 0;
	
	
	public CarSystemController()
	{
		this.theCars = new Car[MAX_NO_OF_CARS];		
	}
	
	public String addCar(String make, String model, int year)
	{
		if(make.length() == 0)
		{
			return SystemMessages.CAR_MAKE_IS_BLANK;
		}
		
		if(noOfCarsInSystem == MAX_NO_OF_CARS)
		{
			return SystemMessages.CAR_SYSTEM_FULL;
		}
		else
		{
			//Create an instance of Car with the data supplied
			Car c = new Car(make, model, year);
			this.theCars[noOfCarsInSystem] = c;
			noOfCarsInSystem++;
			
			return SystemMessages.CAR_ADD_SUCCESSFUL;
		}
	}
	
	public int getNoOfCarsInSystem()
	{
		return this.noOfCarsInSystem;
	}
	
	public Car[] getCars()
	{
		return this.theCars;
	}
	
	
}
