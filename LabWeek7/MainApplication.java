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
			//FILL IN CODE HERE
		}
		
	}
	
	
}
