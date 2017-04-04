package model;

import java.util.Calendar;
import java.util.Date;

public class Expense 
{
	private String name;
	private int amount;
	private Date dateOfExpense;
	private ExpenseType typeOfExpense;
	
	public Expense(String name, int amount, ExpenseType typeOfExpense)
	{
		this.name = name;
		this.amount = amount;
		this.typeOfExpense = typeOfExpense;
		this.dateOfExpense = Calendar.getInstance().getTime();
	}
	
	
	public ExpenseType getExpenseType()
	{
		return this.typeOfExpense;
	}
	
	public void setExpenseType(ExpenseType typeOfExpense)
	{
		this.typeOfExpense = typeOfExpense;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Date getDateOfExpense() {
		return dateOfExpense;
	}


	public void setDateOfExpense(Date dateOfExpense) {
		this.dateOfExpense = dateOfExpense;
	}
	
	
}
