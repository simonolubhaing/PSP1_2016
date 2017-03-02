package model;

public class Product {

	private String name;
	private String barcode;
	private double price;
	private int noInStock;
	
	public Product(String name, String barcode, double price, int noInStock)
	{
		this.name = name;
		this.barcode = barcode;
		this.price = price;
		this.noInStock = noInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoInStock() {
		return noInStock;
	}

	public void setNoInStock(int noInStock) {
		this.noInStock = noInStock;
	}

	
}
