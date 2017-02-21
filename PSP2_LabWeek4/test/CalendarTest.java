package test;

import org.junit.Test;

import junit.framework.Assert;
import model.Calendar;

public class CalendarTest {

	@Test
	public void testCalendar()
	{
		Calendar c = new Calendar();
		c.addTask("Get Milk", 1.5);
		c.addTask("Put out cat", 2.5);
		c.addTask("Buy Lunch", 3.5);
		
		Assert.assertEquals(3, c.getNoOfTasksAdded());
		
		c.deleteTask();
		Assert.assertEquals(2, c.getNoOfTasksAdded());
		
		
		String expectedString ="Get Milk 1.5 Put out cat 2.5 ";
		String actualStringInCalendar = c.toString();
		Assert.assertEquals(expectedString, actualStringInCalendar);
	}
	
}
