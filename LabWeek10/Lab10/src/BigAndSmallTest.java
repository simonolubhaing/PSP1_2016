
import org.junit.Test;

import junit.framework.Assert;


public class BigAndSmallTest {

	private int[] testNumbersInOrder = {1,3,5,7,9,11};
	private int[] testNumbersNotInOrder = {11,5,3,1,7};
	private int[] testNumbersEmpty = {};
	private int[] testNumbersNull = null;
	
	@Test
	public void testFindBiggest()
	{
		BigAndSmall b = new BigAndSmall();
		int result1 = b.findBiggest(testNumbersInOrder);
		Assert.assertEquals(11, result1);
		
		int result2 = b.findBiggest(testNumbersNotInOrder);
		Assert.assertEquals(11, result2);
		
		int result3 = b.findBiggest(testNumbersEmpty);
		Assert.assertEquals(0, result3);
		
		int result4 = b.findBiggest(testNumbersNull);
		Assert.assertEquals(0, result4);
	}
	@Test
	public void testFindSmallest()
	{
		BigAndSmall b = new BigAndSmall();
		int result1 = b.findSmallest(testNumbersInOrder);
		Assert.assertEquals(1, result1);	
		
		int result2 = b.findSmallest(testNumbersNotInOrder);
		Assert.assertEquals(1, result2);
		
		int result3 = b.findSmallest(testNumbersEmpty);
		Assert.assertEquals(0, result3);
		
		int result4 = b.findSmallest(testNumbersNull);
		Assert.assertEquals(0, result4);

		
	}
}
