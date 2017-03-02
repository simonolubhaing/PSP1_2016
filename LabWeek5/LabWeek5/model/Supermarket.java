package model;

import java.util.ArrayList;

public class Supermarket {
	private String name;
	private String location;
	private int noOfEmployees;
	private ArrayList<Product> productList;
	
	public Supermarket(String name, String location, int noOfEmployees)
	{
		this.name = name;
		this.location = location;
		this.noOfEmployees = noOfEmployees;
		this.productList = new ArrayList<Product>();
	}

	public void addProductToList(Product p)
	{
		this.productList.add(p);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
}
