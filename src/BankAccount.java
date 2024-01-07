/*		@(#)BankAccount.java	Oct 18, 2021
 *
 */


/**
 *	Bank account objects form the foundation for all specific types of bank accocunt.
 *	A bank account can never exist on its own, it must always be an objetc of a specific
 *	type of  bank account (therefore it is "abstract").
 * 
 * @author 
 * @version 1.0.0
 */
public abstract class BankAccount {
	
	
	
	/**
	 * No argument constructor to prevent a bank account with no customer being created.
	 */
	public  BankAccount()	{			}

	
	/**
 	 * Constructor to create a bank account
	 * @param customer A customer is needed in order to open a bank account.	 */
	public BankAccount(Customer customer)	{
		this.customer = customer;
	}

	
	/**
	 * 	Method to withdraw money from a bank account. The withdrawal amount must be 
	 * less than the account balance	
	 * @param Amount of money customer wants to withdraw from their account.
	 * @return	Return the new balance
	 */
	public double withDraw(double withDrawAmount)	{
		if (withDrawAmount > balance)	{
			System.out.println("Not enough balance");
		} else	{
			balance -= withDrawAmount;
		}
		
		return balance;
	}
	
	
	/**
	 * Deposit cash or cheques into a customer's bank account.  The deposit must be a positive amount.
	 * @param withdrawalAmount	The amount of currency being added to a customers account.
	 * @return	The new balance after the deposit.
	 */
	public double deposit(double depositAmount)	{
		return balance += depositAmount;
	}

	/**
	 * Get the account owners name for this account
	 * @return	first and last name of the bank account owner.
	 */
	public String accountOwner()	{
		return customer.getName();
	}
	
	
	
	/**
	 * This method is used to calculate a service charge for a bank account.
	 * However... there is no default way to calculate a service charge so...
	 * we will force a child class to implement (defer implementation to the child)
	 * the calculateServiceCharge() method by making it an abstract method.
	 * This will also force the entire class to be abstract.
	 * 
	 * @return	The amount of service charged calculated rounded to 2 decimal places.
	 */
	public abstract double calculateServiceCharge();
	
	
	
	/** This is the where a customer is stored	(the customer is stored in the variable customer which is an object of customer)										*/
	private Customer customer;

	/** This is where the account balance is stored. It is initialized to 0.										*/
	protected double balance;
}
