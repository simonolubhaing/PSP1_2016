
public class CountryOperations 
{
	public int calculateAverageCountryLength(String[] countryNames)
	{
		int runningTotal = 0;
		for (int i=0; i<countryNames.length; i++)
		{
			runningTotal = runningTotal + countryNames[i].length(); 
		}
		return runningTotal / countryNames.length;
	}
	
	public int getNumberOfCountriesBeginngWithLetter(String letterSequence, String[] countryNames)
	{
		int counter = 0;
		for (int i=0; i<countryNames.length; i++)
		{
			if(countryNames[i].startsWith(letterSequence))
			{
				counter++;
			}
		}
		return counter;
	}
	
	public void printMenu()
	{
		System.out.println("Please choose an option");
		System.out.println("1. Calculate the average country length");
		System.out.println("2. Find the number of countries beginning with a letter sequence");
		System.out.println("3. Exit");
	}
	
}
