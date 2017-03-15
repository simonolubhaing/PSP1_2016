package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Person;

public class Controller {

	private static final String FILE_LOCATION = "H:\\temp\\people.dat";
	//This is our model for this program
	private ArrayList<Person> thePeople;
	
	public Controller()
	{
		//Create an instance of the ArrayList. It is initially empty.
		this.thePeople = new ArrayList<Person>();
	}
	
	//This method would be called from the user interface with the data the user entered about a person.
	public void addPerson(String name, int age)
	{
		//Create an instance / object of type Person with the details passed into this method. 
		Person p = new Person(name, age);
		this.thePeople.add(p);
	}
	
	
	public void save()
	{
		try
		{
			File f = new File(FILE_LOCATION);
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.thePeople);
			oos.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<Person> getPeople()
	{
		return this.thePeople;
	}
	
	
	public void load()
	{
		try{
			//We want to read the serialized file (if it exists) and get the ArrayList<Person> out of it.
			//We then want to put that into the ArrayList thePeople above so that the data from the file is loaded into our system.
			FileInputStream fis = new FileInputStream(FILE_LOCATION);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//Read the ArrayList directly out of the file and assign it to our variable thePeople.
			this.thePeople = (ArrayList<Person>)ois.readObject();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
}
