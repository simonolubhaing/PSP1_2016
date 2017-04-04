package model;

import java.util.ArrayList;

public class Budget 
{
	private ArrayList<Expense> expenseList;
	private int limit;
	
	public Budget()
	{
		this.expenseList = new ArrayList<Expense>();
		this.limit = 0;
	}

	public Budget(int limit)
	{
		this.expenseList = new ArrayList<Expense>();
		this.limit = limit;
	}
	
	public int getLimit()
	{
		return this.limit;
	}
	
	public void setLimit(int limit)
	{
		this.limit = limit;
	}
	
	public ArrayList<Expense> getExpenseList()
	{
		return this.expenseList;
	}
	
	public String addExpense(String name, int amount, ExpenseType type)
	{
		if((amount + getTotalSpentSoFar())  > limit)
		{
			return "This expense exceeds your limit. You only have "+(limit-getTotalSpentSoFar())+ "left";
		}
		else{
			
			Expense e = new Expense(name, amount, type);
			this.expenseList.add(e);
			return "Expense added. You have "+(limit-getTotalSpentSoFar())+ "left";
		}
	}
	
	private int getTotalSpentSoFar()
	{
		int totalSpent = 0;
		for(Expense e : this.expenseList)
		{
			totalSpent += e.getAmount();
		}
		return totalSpent;
	}
	
	
}
