import java.util.Scanner;

public class AverageNumberCalculator {

	public static void main(String[] args)
	{
		//Declare the variables which will store the three numbers supplied by the user
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		
		//Create the Scanner ready to listen to keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user to enter the numbers and 
		//store their responses in the variables already declared above.
		System.out.println("Please enter first number ?");
		firstNumber = keyboard.nextInt();
		
		System.out.println("Please enter second number ?");
		secondNumber = keyboard.nextInt();
		
		System.out.println("Please enter third number ?");
		thirdNumber = keyboard.nextInt();
	
		//Now print out the average of the three numbers.
		//NOTE : Here you are doing a calculation and concatenating it onto the end of a String.
		System.out.println("The average of the numbers is : "+(firstNumber+secondNumber+thirdNumber)/3);
		
		
		
	}
}
