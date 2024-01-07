/*		@(#)Customer.java	Oct 18, 2021
 *
 */

/**
 * This class represents a bank customer. Customers can open bank accounts have
 * particulars like name and address, telephone number.
 * 
 * @author
 * @version 1.0.0
 */
public class Customer {
	public static final String HOME_PHONE = "H";
	public static final String WORK_PHONE = "W";
	public static final String CELL_PHONE = "C";


	/**
	 * Make the default CONSTRUCTOR private to prevent instantiating a customer
	 * object with no name or address.
	 */
	private Customer() {
		name = "";
		address = "";
	}

	/**
	 * Overloaded Constructor to create a customer with a name and address
	 * 
	 * @param name
	 *          the name of the customer
	 * @param address
	 *           the adress of the customer
	 */
	public Customer(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

	/**
	 * Method to get the name of the customer
	 * @return name of the customer
	 */
	public String getName() 			{	return name;		}
	/**
	 * Method to get the address of the customer
	 * @return address of the customer
	 */
	public String getAddress()			{	return address;	}

	/**
	 * Method to get the full list(array) of phone numbers for a customer
	 * @return all phone numbers in the array
	 */
	public String[][] phoneNumbers()	 {	return phoneNumbers;	}

	/**
	 * Method to change/set the name for a customer
	 * @param name the name that the customer wants to change theirs to
	 */
	public void setName(String name)							{	this.name = name;	}
	/**
	 * Method to change/set the address for a customer
	 * @param name the address that the customer wants to change theirs to
	 */
	public void setAddress(String address)					{	this.address = address;	}
	/**
	 * Method to insert the phone number along with the type into the array "phoneNumbers"
	 * @param phoneNumber the phone number to be added
	 * @param type The type of phone number(work,home,cell)
	 */
	public void addPhoneNumber(String phoneNumber, String type)		{
	
		phoneNumbers[numberOfPhoneNumbers][0]=phoneNumber;
		phoneNumbers[numberOfPhoneNumbers][1]=type;
		numberOfPhoneNumbers++;
	}

	
	/**
	 * Override the method toString() from class Object
	 */
	public String toString() {
	
		String customerString = "[name=" + name + ",address=" + address;
		for(int i=0;i<numberOfPhoneNumbers;i++) {
			if (phoneNumbers[i][0]!= null ) {
				customerString= customerString + " Number: " + phoneNumbers[i][0] + " Type: "+ phoneNumbers[i][1] +",";

			}
		}
		customerString= customerString + "]";
		return customerString;
	}

	/**
	 *	Open a bank account for this customer.
	 *	This customer should be the owner of the account.
	 * 
	 * @return	True if successfully added else false
	 */
	public boolean openABankAccount(BankAccount account) {
		if (account == null)	{
			return false;
		}
		myAccounts[numberOfAccounts] = account;
		numberOfAccounts++;
		return true;
	}


	/**
	 * Allowing access to the array of accounts allow you to iterate thru the array and
	 * display accounts types and balances.
	 * @return myAccounts show all the accounts in the array
	 */
	public BankAccount[] bankAccounts()	{ return myAccounts;		}

	/**
	 * The full name of a customer, first middle and last not including a
	 * salutation
	 */
	private String name;

	/**
	 * The full address for a customer including street, city,province, country
	 */
	private String address;


	/** 2 dimensional array of phonenumbers and phonenumber types			*/
	protected String phoneNumbers[][] = new String[5][2];
	/** Current number of phone numbers in the array of phoneNumbers		*/
	private int numberOfPhoneNumbers;

	/**
	 * Array of bank accounts for this customer.
	 */
	protected BankAccount[] myAccounts = new BankAccount[10];		// Allow for up to 10 bank accounts
	/** Current number of accounts in the array myAccounts */
	private int numberOfAccounts;
}