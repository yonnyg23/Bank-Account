

/*		@(#)TestCustomer.java	Oct 18, 2021
 *
 */
/**
 * Test Class for Customer
 * 
 * @author 
 * @version 1.0.0
 */
public class TestCustomer {
	
	
	/**
	 * Main method to test all behaviors of a customer
	 * @param args	Command line arguments that may be passed to the class at invocation time.
	 */
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Sally Smith", "1385 woodroffe ave.");	

		customer1.addPhoneNumber("343-999-1781", Customer.HOME_PHONE);
		customer1.addPhoneNumber("343-999-6756", Customer.WORK_PHONE);
		customer1.addPhoneNumber("343-999-8300", Customer.CELL_PHONE);
		System.out.println("Customer1:toString():" + customer1);
		System.out.println("Customer1:getName():" + customer1.getName());
		System.out.println("Customer1:getAddress():" + customer1.getAddress());
		
		
		
		ChequingAccount cheqAcct = new ChequingAccount(customer1);
		SavingsAccount savingAcct = new SavingsAccount(customer1);
		DailyInterestAccount dailyAcct = new DailyInterestAccount(customer1);
		ChequingAccount cheqAcct2 = new ChequingAccount(customer1);

		
		customer1.openABankAccount(dailyAcct);
		customer1.openABankAccount(savingAcct);
		customer1.openABankAccount(cheqAcct);
		customer1.openABankAccount(cheqAcct2);

		
	
		System.out.println("All phone numbers for: " + customer1.getName());
		for(int i = 0; i <customer1.phoneNumbers.length ; i ++) {
			if (customer1.phoneNumbers[i][0]!= null ) {
				int numNumbers=i+1;
			System.out.println("Number "+ numNumbers + ": " + customer1.phoneNumbers[i][0] + " Type: "+ customer1.phoneNumbers[i][1]);
			}
		}
		System.out.println("All bank accounts for: " + customer1.getName());

		for(int i=0;i<customer1.myAccounts.length;i++) {
			if(customer1.myAccounts[i]!=null) {
				int numAccounts=i+1;
				System.out.println("Account " + numAccounts + ": " + customer1.myAccounts[i]);
			}
		}
		for (int val = 0; val < 4; val ++)    {
			   int sum = val;
			   
			   for (int num = 0; num < val; num++)    {
			      sum = sum + num;
			   }
			   
			   System.out.print(sum + " ");
			}
		int a = 5;

		while (a >= 1)    {
		   int num = 1;
		   for (int b = 1; b <= a; b++)    {   
		      System.out.print(num + "**");
		      num = num * 2;
		   }
		   
		   System.out.println();
		   a = a - 1;
		}
		
		boolean token1 = true;

		while (token1)    {
		   for (int i = 0; i < 10; i++)    {
		      System.out.println("Hello");
		   }
		   token1 = false;
		}
		}
		}


