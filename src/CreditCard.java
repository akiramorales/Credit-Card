/**
 * 
 * @author Akira Morales
 * Credit Card
 * Period 6
 */
public class CreditCard
{
	//comment stuff
	private final int CARD_NUM;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	public CreditCard(int cardNumIn, double limitIn, double interestRateIn, String holderNameIn)
	{
		CARD_NUM = cardNumIn;
		limit = limitIn;
		balance = 0;
		interestRate = interestRateIn;
		holderName = holderNameIn;
	}
	
	public void charge(double amount)
	{
		if(balance + amount < limit)
			balance = balance + amount;
	}
	
	public void credit(double amount)
	{
		balance = balance - amount;
	}
	
	public void chargeInterest()
	{
		balance = (1 + interestRate) * balance;
	}
	
	public int getCardNum()
	{
		return CARD_NUM;
	}
	
	public double getLimit()
	{
		return limit;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public String holderName()
	{
		return holderName;
	}
	
	public String toString()
	{
		return "Card Number: " + CARD_NUM + "\tName: " + holderName + "\tBalance: " + balance + "\tRate: " + interestRate + "\tLimit" + limit;
	}
}
