import java.util.Scanner;


public class NameLengths {

	public static void main(String[] args)
	{
		//Declare the variables which will store the two names supplied by the user
		String firstName = "";
		String secondName = "";
		
		//Create the Scanner ready to listen to keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user for the first name.
		System.out.println("Please enter first name : ");
		firstName = keyboard.next();
		
		//Prompt the user for the second name.
		System.out.println("Please enter second name : ");
		secondName = keyboard.next();
			
		//Print out a message about the length of the first name
		System.out.println(firstName + " your name has "+firstName.length()+ "letters.");
		
		//Print out a message about the length of the second name
		System.out.println(secondName + " your name has "+secondName.length()+ "letters.");

	}
}
