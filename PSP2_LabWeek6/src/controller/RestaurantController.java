package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import model.ItemOnMenu;
import model.Restaurant;

public class RestaurantController {

	private Restaurant restaurantModel;
	
	public RestaurantController()
	{
		this.restaurantModel = new Restaurant("CIT Canteen");
	}
	
	//Clears the ArrayList<ItemOnMenu> inside Restaurant (using the clear method of ArrayList)
	public void clearMenu()
	{
		this.restaurantModel.getMenuItems().clear();
	}
	
	//Allow the user interface (or test) to ask the controller how many menu items are stored in the model.
	public int getNoOfItemsOnMenu()
	{
		return this.restaurantModel.getMenuItems().size();
	}
	
	//Allows the user interface (or test) to add a new item to the menu
	public void addItemToMenu(String name, int price)
	{
		ItemOnMenu newItem = new ItemOnMenu(name, price);
		this.restaurantModel.addMenuItemToRestaurant(newItem);
	}
	
	public void loadFromFile()
	{
		try
		{
			File menuFile = new File("H:\\restaurant\\menu.txt");
			if(!menuFile.exists())
			{
				//If the file doesn't exist we have nothing to process so we return
				return;
			}
			//Create the FileReader and wrap it around the File object
			FileReader menuReader = new FileReader(menuFile);
			//Create the BufferedReader and wrap it around the FileReader object
			BufferedReader buffReader = new BufferedReader(menuReader);
			
			
			//Read the entire file line by line
			String lineFromFile = buffReader.readLine();
			
			while(lineFromFile != null)
			{
				//lineFromFile contains something like Steak 25. We want to 
				//split this into the String "Steak" and the int 25
				String[] bitsOfString = lineFromFile.split(" ");
				
				//After the split String method we have two Strings "Steak", "25"
				//We convert the String "25" to the int 25 by using Integer.parseInt
				
				//We now have the raw date to create an instance of ItemOnMenu. We create
				//the instance and then add it to the Restaurant model (i.e. The ArrayList which Restaurant has inside it)
				ItemOnMenu newMenuItem = new ItemOnMenu(bitsOfString[0], Integer.parseInt(bitsOfString[1]));
				this.restaurantModel.addMenuItemToRestaurant(newMenuItem);
				
				//Read the next line. Then the loop starts again. If the line is not null it will get processed and another object 
				//will be created.
				lineFromFile = buffReader.readLine();				
			}
			buffReader.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}			
	}
	
	public void saveToFile()
	{
		try
		{
			File menuFile = new File("H:\\restaurant\\menu.txt");
			if(!menuFile.exists())
			{
				menuFile.createNewFile();
			}
			FileWriter menuWriter = new FileWriter(menuFile);
			
			//Go through the ArrayList<ItemOnMenu> inside the Restaurant and write a line to the file for each ItemInMenu in the list			
			for(ItemOnMenu currentMenuItem : this.restaurantModel.getMenuItems())
			{
				menuWriter.write(currentMenuItem.getName() + " "+ currentMenuItem.getPrice()+"\n");
			}
			menuWriter.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
}
