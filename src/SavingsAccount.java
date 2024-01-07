/*		@(#)SavingsAccount.java	Oct 18, 2021
 *
 */

/**
 *	A savings account is a specific type of bank account.
 *	At this point the savings account has a unique service charge calculation.
 */
public class SavingsAccount extends BankAccount		{

	/**
	 * no argument constructor to prevent a chequing account with no customer from being made
	 */
	private SavingsAccount()	{}
	
	
	/**
	 * Initialize the bank account object by giving the parent (BankAccount)
	 * the customer object reference.
	 */
	public SavingsAccount(Customer customer)	{
		super(customer);
	}

	/**
	 *  This method calculates the service charge for a Savings account
	 * 	Service charges for a savings account is a monthly amount of $5.00.
	 * @return balance the updated balance
	 */
	public double calculateServiceCharge()	{
		double serviceCharge = 5.0;
		balance += serviceCharge;
		return balance;
	}
	
	
}
