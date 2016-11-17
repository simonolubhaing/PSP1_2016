public class BigAndSmall {

	public int findBiggest(int[] numbers)
	{
				
		//Error handling to cope with empty arrays
		if(numbers == null || numbers.length == 0)
		{
			return 0;
		}
		
		//Presume first is largest
		int largestSoFar = numbers[0];
		
		//Go looking through the rest of the array.
		//If you find a number bigger than largestSoFar, put it into
		//largestSoFar and overwrite the previous value
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i] > largestSoFar)
			{
				largestSoFar = numbers[i];
			}
		}
		
		return largestSoFar;
	}

	public int findSmallest(int[] numbers)
	{
		//Error handling to cope with empty arrays
		if(numbers == null || numbers.length == 0)
		{
			return 0;
		}
		//Presume first is largest
		int smallestSoFar = numbers[0];
		
		//Go looking through the rest of the array.
		//If you find a number smaller than smallestSoFar, put it into
		//smallestSoFar and overwrite the previous value
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i] < smallestSoFar)
			{
				smallestSoFar = numbers[i];
			}
		}
		
		return smallestSoFar;

	}
}