import java.util.Scanner;


public class MainApplication {

	private static final int INITIAL_BALANCE = 10;
	
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		String usersChoice = "";
		int usersBalance = INITIAL_BALANCE;
		LotteryGame lottery = new LotteryGame();
	
		System.out.println("Do you want to play the lottery(y/n) ?");
		usersChoice = keyboard.next();
		
		while(usersChoice.equalsIgnoreCase("y") && usersBalance > 0)
		{
			//Subtract one for a user play
			usersBalance--;
			
			//Run the lottery.
			int winnings = lottery.playTheGame();
			
			if(winnings > 0)
			{
				System.out.println("You won : "+winnings);
			}
			else
			{
				System.out.println("Hard Luck, try again!");
			}
			//Add any winnings they have
			usersBalance += winnings;
			
			//Print their tickets, the lottery numbers and their current balance.
			lottery.printUserTicket();
			lottery.printLotteryNumbers();
			
			System.out.println("Your balance is : "+ usersBalance);
			System.out.println();

			System.out.println("Do you want to play the lottery again (y/n) ?");
			usersChoice = keyboard.next();

		}
		
	}
	
	
}
