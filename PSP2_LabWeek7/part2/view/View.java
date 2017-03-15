package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import model.Person;

public class View {
	
	private Controller theController;
	private int menuChoice;
	
	private static final int ADD_PERSON = 1;
	private static final int SAVE = 2;
	private static final int PRINT_ALL = 3;
	private static final int LOAD = 4;
	private static final int EXIT = 5;
	
	public View()
	{
		this.theController = new Controller();
	}

	
	public void start()
	{
		Scanner keyboard = new Scanner(System.in);
		displayMenu();
		menuChoice = keyboard.nextInt();
		
		while(menuChoice != EXIT)
		{
			switch(menuChoice)
			{
				case ADD_PERSON :{
					String name = "";
					int age = 0;
					
					System.out.println("Please enter person's name ?");
					name = keyboard.next();
					
					System.out.println("Please enter the person's age ?");
					age = keyboard.nextInt();
					this.theController.addPerson(name, age);
					break;
				}
				case SAVE :
				{
					this.theController.save(); break;
				}
				
				case PRINT_ALL : {
					ArrayList<Person> thePeople = this.theController.getPeople();
					for(Person p : thePeople)
					{
						System.out.println(p);
					}
					break;
				}
				case LOAD :{
					this.theController.load(); break;
				}
			}
			displayMenu();
			menuChoice = keyboard.nextInt();
		}
		
		
	}
	
	
	public void displayMenu()
	{
		System.out.println();
		System.out.println("1. Add a Person");
		System.out.println("2. Save");
		System.out.println("3. Print all people");
		System.out.println("4. Load");
		System.out.println("5. Exit");
	}
}
