package view;

import java.util.Scanner;
import controller.Controller;

public class View {

	private Controller theController;
	
	public View()
	{
		this.theController = new Controller();
	}
		
		
	public void start()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What directory do you want to examine ?");
		String directoryEntered = keyboard.next();
		
		int result = this.theController.findNoOfFilesInDirectory(directoryEntered);
		System.out.println("Number of files in directory = "+result);
	}
	
}
