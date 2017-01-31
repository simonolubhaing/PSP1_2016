import java.util.Scanner;


public class MyApplicationView {
	private static final int ADD_TO_TANK = 1;
	private static final int REMOVE_FROM_TANK = 2;
	private static final int DISPLAY_CURRENT_VOLUME = 3;
	private static final int EXIT = 4;


	public static void main(String[] args) {

		int menuChoice = 0;
		WaterTankController wtc = new WaterTankController(15);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		displayMenu();
		menuChoice = keyboard.nextInt();
		while(menuChoice != EXIT)
		{
			switch (menuChoice){
				case ADD_TO_TANK : {
					int amountToAdd = 0;
					System.out.println("How much do you want to add ?");
					amountToAdd = keyboard.nextInt();
					if(wtc.addToTank(amountToAdd))
					{
						System.out.println("Successfully added "+amountToAdd+ ". The volume is now "+wtc.getCurrentTankVolume());
					}
					else
					{
						System.out.println("This would overfill the tank. Cannot add this amount");
					}
					break;
				}
				case REMOVE_FROM_TANK :{
					int amountToRemove = 0;
					System.out.println("How much do you want to remove ?");
					amountToRemove = keyboard.nextInt();
					
					if(wtc.removeFromTank(amountToRemove))
					{
						System.out.println("Successfully removed "+amountToRemove);
					}
					else
					{
						System.out.println("There is not enough in the tank to remove this much.");
					}
					break;
				}
				case DISPLAY_CURRENT_VOLUME : {
					System.out.println("Tank Volume = "+wtc.getCurrentTankVolume());
				}
			}
			displayMenu();
			menuChoice = keyboard.nextInt();
		}
			
		System.out.println("Goodbye");
			
	}
	
	private static void displayMenu()
	{
		System.out.println();
		System.out.println("1. Add to Tank");
		System.out.println("2. Remove from Tank");
		System.out.println("3  Display Current Volume in Tank");
		System.out.println("4. Exit.");
		System.out.println();
	}

}
