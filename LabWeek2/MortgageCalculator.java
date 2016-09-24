import java.util.Scanner;


public class MortgageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int amountToBorrow = 0;
		int yearsToBorrowFor = 0;
		double interestOnLoan = 0;
		double totalToRepay = 0;
		double repaymentPerMonth = 0;
		
		//Create the Scanner ready to listen to keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Ask for the amount the user wants to borrow and how 
		//long they want to borrow for. Store their responses in the relevant
		//variables declared above.
		System.out.println("How much do you want to borrow ?");
		amountToBorrow = keyboard.nextInt();
		
		System.out.println("How many years do you want to borrow over ?");
		yearsToBorrowFor = keyboard.nextInt();
		
		//Just do a simple interest calculation by getting 1% of the amount borrowed.
		interestOnLoan = amountToBorrow * 0.01;
		totalToRepay = amountToBorrow + interestOnLoan;
		
		repaymentPerMonth = totalToRepay / (yearsToBorrowFor * 12);
		
		System.out.println("Your monthly repayment is : "+repaymentPerMonth);
		
	}

}
