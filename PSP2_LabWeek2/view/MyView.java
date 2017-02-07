package view;

import java.util.Scanner;

import controller.MyController;
import model.Person;

public class MyView 
{
	private static final int ADD_A_PERSON = 1;
	private static final int DISPLAY_ALL_PEOPLE = 2;
	private static final int EXIT = 3;
	
	private int menuChoice;	
	private MyController theController;
	
	//This is the default constructor. We have added some of our own code in here
	//to create an instance of the controller which this view class will use.
	public MyView()
	{
		this.theController = new MyController();
	}
	
	
	public void startUserInterface()
	{
		Scanner keyboard = new Scanner(System.in);
		displayMenu();
		menuChoice = keyboard.nextInt();
		
		//Keep looping while the user has not chosen to exit.
		while(menuChoice != EXIT)
		{
			switch(menuChoice)
			{
				case ADD_A_PERSON : {
					//Do whatever needs to be done to add a person
					String name = "";
					int age = 0;
					
					System.out.println("Please enter person's name");
					name = keyboard.next();
					System.out.println("Please enter person's age ");
					age = keyboard.nextInt();
					
					//The user interface has gathered the name and age. We now
					//send them to the controller for "processing".
					theController.addPerson(name, age);
					break;
				}
				
				case DISPLAY_ALL_PEOPLE : {
					//Do whatever needs to be done to lookup a person
					//If the user wants to display all people we ask the controller to give us
					//all the people which it has stored in its array of People.
					Person[] thePeople = theController.displayAllPeople();
					int noOfPeopleInArray = theController.getNoOfPeopleInArray();
					
					//We use noOfPeopleInArray here instead of thePeople.length because we 
					//only want to visit slots in the array which have a Person object in them.
					//We don't want to visit empty slots later in the array which contain null in each.
					
					for(int i=0; i<noOfPeopleInArray; i++)
					{
						Person currentPerson = thePeople[i];
						System.out.println(currentPerson.getName()+ " "+currentPerson.getAge());
					}
					break;					
				}
			}
			displayMenu();
			menuChoice = keyboard.nextInt();			
		}
		
		System.out.println("Goodbye!");
		
	}
	
	public void displayMenu()
	{
		System.out.println();
		System.out.println("1. Add a Person ");
		System.out.println("2. Display All People in system ");
		System.out.println("3. Exit");
		System.out.println();
	}
	
}
