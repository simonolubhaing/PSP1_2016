package model;

import java.util.ArrayList;

public class Restaurant {

	private String businessName;
	private ArrayList<ItemOnMenu> menuItems;
	
	public Restaurant(String businessName)
	{
		this.businessName = businessName;
		this.menuItems = new ArrayList<ItemOnMenu>();
	}

	public void addMenuItemToRestaurant(ItemOnMenu item)
	{
		this.menuItems.add(item);
	}
	
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public ArrayList<ItemOnMenu> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(ArrayList<ItemOnMenu> menuItems) {
		this.menuItems = menuItems;
	}
	
	
	
}
