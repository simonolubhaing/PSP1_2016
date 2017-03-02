package controller;

import java.util.ArrayList;

import model.Product;
import model.Supermarket;

public class SupermarketController 
{
	private Supermarket supermarketModel;
	
	public SupermarketController()
	{
		this.supermarketModel = new Supermarket("Tesco", "Wilton", 150);
	}
	
	public void addProduct(String name, double price, String barcode, int noInStock)
	{
		Product p = new Product(name, barcode, price, noInStock);
		
		//Either of the two lines below do the same thing and are equally valid.
		//1. The first asks the supermarket for its list and we add the product to its list here.
		//2. The second gives the product to the supermarket and lets it add the list itself.
		
		//this.supermarketModel.getProductList().add(p);
		this.supermarketModel.addProductToList(p);
		
	}
	
	public void removeProduct(String barcode)
	{
		int indexOfItemToRemove = -1;
		for(Product currentProduct :this.supermarketModel.getProductList())
		{
			if(currentProduct.getBarcode().equals(barcode))
			{
				indexOfItemToRemove = this.supermarketModel.getProductList().indexOf(currentProduct);
			}
		}
		this.supermarketModel.getProductList().remove(indexOfItemToRemove);
	}
	
	public ArrayList<Product> searchForProduct(String name)
	{
		ArrayList<Product> listOfMatchedItems = new ArrayList<Product>();
		
		for(Product currentProduct :this.supermarketModel.getProductList())
		{
			if(currentProduct.getName().contains(name))
			{
				listOfMatchedItems.add(currentProduct);
			}
		}
		
		return listOfMatchedItems;
		
	}
	
	public int getNoOfProducts()
	{
		return this.supermarketModel.getProductList().size();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
