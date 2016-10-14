import java.util.Scanner;


public class MainProgram {

	public static void main(String[] args)
	{
		String[] countryNames = {"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan", "The Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia","Cameroon","Canada", "Cabo Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo ", "Republic of the Congo","Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czech Republic", "Denmark","Djibouti","Dominica", "Dominican Republic", "East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia", "Fiji", "Finland", "France", "Gabon","Gambia, The","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana", "Haiti","Holy See","Honduras","Hong Kong","Hungary", "Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy", "Jamaica","Japan","Jordan", "Kazakhstan","Kenya","Kiribati","North Korea","South Korea","Kosovo","Kuwait","Kyrgyzstan", "Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg", "Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia", "Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique", "Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway", "Oman", "Pakistan","Palau","Palestinian Territories","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland", "Portugal", "Qatar", "Romania","Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia", "Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa", "South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland", "Sweden","Switzerland","Syria", "Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu", "Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan", "Vanuatu","Venezuela","Vietnam", "Yemen", "Zambia","Zimbabwe"};
		//We want a variable to capture the users response when asked to choose a menu item.
		int usersResponse = 0;
		//We want a variable to capture the users response if they choose option 2 and are then asked to enter a character sequence.
		String letterSeq = "";
		Scanner keyboard = new Scanner(System.in);
		//This creates an instance of CountryOperations in memory so that we can then have use of its methods.		
		CountryOperations countryOpsInstance = new CountryOperations();
		//We display the menu
		countryOpsInstance.printMenu();
		//The printMenu method will have prompted the user to enter a value.
		usersResponse = keyboard.nextInt();
		
		//As long as the user has not entered 3 we want the while loop to execute.
		//Each time through the while loop we will decide what to do based on their entered option.
		//Once we have reponded to their action we will display the menu again at the bottom of the 
		//while loop to see if the user wants to execute another action and go through the loop again.
		
		while(usersResponse != 3)
		{
			if(usersResponse == 1)
			{
				int result = countryOpsInstance.calculateAverageCountryLength(countryNames);
				System.out.println("The average country name length is : "+result);
			}
			else if(usersResponse == 2)
			{
				System.out.println("What letter sequence do you want to check ?");
				letterSeq = keyboard.next();
				int result2 = countryOpsInstance.getNumberOfCountriesBeginngWithLetter(letterSeq, countryNames);
				System.out.println("The number of countries beginning with "+letterSeq+" is "+result2);
			}
			else
			{
				System.out.println("You have entered an invalid option");
			}
			//Show the menu and capture users response.
			countryOpsInstance.printMenu();
			usersResponse = keyboard.nextInt();
		}
		//At this point we have exited the while loop and the program is finished
		System.out.println("Goodbye!");
	}
	
}
