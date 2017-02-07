package controller;

import model.Person;

public class MyController 
{
	private Person[] thePeople;
	private int noOfPeopleInArray = 0;
	
	public MyController()
	{
		thePeople = new Person[10];
	}
	
	
	//We expect the view / user interface to gather the name
	//and age of a person which we wish to add to the system.
	public void addPerson(String nameFromView, int ageFromView)
	{
		//Create a person object using the data received from the view
		Person p = new Person(nameFromView, ageFromView);
		
		//Put this new object into the array
		thePeople[noOfPeopleInArray] = p;
		noOfPeopleInArray++;		
	}
	
	//If the user interface wants to display all people. It calls this method which 
	//will return the array of people to the user interface. It is then the user interface's job
	//to display that data.
	public Person[] displayAllPeople()
	{
		return this.thePeople;
	}
	
	public int getNoOfPeopleInArray()
	{
		return this.noOfPeopleInArray;
	}

}
