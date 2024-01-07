/*		@(#)ChequingAccount.java	Oct 18, 2021
 *
 */

/**
 * TODO: Document me (the Class)
 */
public class ChequingAccount extends BankAccount	 {

	/**
	 * no argument constructor to prevent a chequing account with no customer from being made
	 */
	private ChequingAccount()	{}
	
	/**
	 * Constructor for creating a chequing account
	 * @param customer is needed in order to create a chequing account
	 */
	public ChequingAccount(Customer customer)	{
		super(customer);
	}
	
	/**
	 * This method calculates the service charge for a chequing account
	 * @return The balance after the service charge has been placed on the balance
	 */
	public double calculateServiceCharge()	{
		double serviceCharge = 10.0;
		return (balance +=serviceCharge);
	}
	

}

