package model;

public class Task 
{
	private String name;
	private double duration;

	
	public Task(String name, double duration)
	{
		this.name = name;
		this.duration = duration;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getDuration()
	{
		return this.duration;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDuration(double duration)
	{
		this.duration = duration;
	}
	
	public String toString()
	{
		return this.name + " " +this.duration;
	}
}
