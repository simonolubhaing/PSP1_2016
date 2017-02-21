package model;

public class Calendar 
{
	//This is NOT an attribute of the Calendar class
	private static final int MAX_NO_OF_TASKS = 10;
	
	//This is an attribute of the Calendar class
	private Task[] theTasks;	
	private int noOfTasksAdded; 
	
	public Calendar()
	{
		this.theTasks = new Task[MAX_NO_OF_TASKS];
		this.noOfTasksAdded = 0;
	}
	
	public void addTask(String name, double duration)
	{
		Task t = new Task(name, duration);
		this.theTasks[noOfTasksAdded] = t;
		noOfTasksAdded++;
	}
	
	public void deleteTask()
	{
		this.theTasks[noOfTasksAdded-1] = null;
		noOfTasksAdded--;
	}
	
	public int getNoOfTasksAdded()
	{
		return this.noOfTasksAdded;
	}
	
	public String toString()
	{
		String strOfAllTasks = "";
		
		for(int i=0; i<noOfTasksAdded; i++)
		{
			Task currTask = this.theTasks[i];
			strOfAllTasks += currTask.toString();
			strOfAllTasks += " ";
		}
		return strOfAllTasks;
		
	}
	
}
