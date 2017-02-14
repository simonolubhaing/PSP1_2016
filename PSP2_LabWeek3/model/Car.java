package model;

public class Car {

	private String make;
	private String model;
	private int year;
	private boolean sold;
	
	
	public Car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		//We can presume the car is initially unsold when entered in system
		this.sold = false; 
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean getSold() {
		return sold;
	}


	public void setSold(boolean sold) {
		this.sold = sold;
	}
	

}
