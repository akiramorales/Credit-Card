/**
 * 
 * @author Akira Morales
 * Credit Card Test Class
 * Period 6
 */
public class CreditCardMain
{

	public static void main(String[] args)
	{
		CreditCard[] creditCards = new CreditCard[5];
		creditCards[0] = new CreditCard(1, 1000, .09, "A");
		creditCards[1] = new CreditCard(2, 1000, .09, "B");
		creditCards[2] = new CreditCard(3, 1000, .09, "C");
		creditCards[3] = new CreditCard(4, 1000, .09, "D");
		creditCards[4] = new CreditCard(5, 1000, .09, "E");
		
		int carNumIn1 = 0;
		for(CreditCard card : creditCards)
		{
			if(carNumIn1 == card.getCardNum())
			{
				card.charge(300);
			}
		}
		
		int carNumIn2 = 12;
		for(CreditCard card : creditCards)
		{
			if(carNumIn2 == card.getCardNum())
			{
				card.charge(600);
			}
		}
		
		for(CreditCard card : creditCards)
		{
			if(carNumIn1 == card.getCardNum())
			{
				card.charge(50);
			}
		}
	}
}
