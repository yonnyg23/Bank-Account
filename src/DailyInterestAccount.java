/*		@(#)DailyInterestAccount.java	Oct 18, 2021
 *
 */


/**
 * TODO: Document me
 * 
 * @author 
 * @version 1.0.0
 */
public class DailyInterestAccount extends BankAccount	{

	/**
	 * no argument constructor to prevent a chequing account with no customer from being made
	 */
	private DailyInterestAccount()	{}
	
	
	/**
	 * Initialize the bank account object by giving the parent (BankAccount)
	 * the customer object reference.
	 */
	public DailyInterestAccount(Customer customer)	{
		super(customer);
	}

	
	/**
	 * Method to calculate service charge on a DailyInterestAccount
	 * The service charge calculation for a daily interest account is 1.5% if the balance is over $1000.00
	 *	else if balance is under $1000.00 2%
	 *@return balance the updated balance
	 */
	public double calculateServiceCharge()	{
		double interest = balance * .02;
		if (balance > 1000)	{
			interest = balance * .015;
		}
		
		balance = balance + interest;
		
		return balance;
	}

}
