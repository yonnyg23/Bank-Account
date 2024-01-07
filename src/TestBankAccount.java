/*		@(#)TestSavingsAccount.java	Oct 18, 2021
 *
 */


/**
 * Class to test the BankAccount class.
 * 
 * @author yonathan
 * @version 1.0.0
 */
public class TestBankAccount {
	/**
	 * Main method to test account behaviors
	 * @param args	Command line arguments that may be passed to the class at invocation time.
	 */
	public static void main(String[] args) {
		
		System.out.println("\n\nTesting of Account types  ******\n");
		Customer customer1 = new Customer("Sally Smith", "1385 woodroffe ave.");
		System.out.println("Created a cusotmer:" + customer1);
		
		SavingsAccount savingsAccount = new SavingsAccount(customer1);
		testAccount(savingsAccount);
		
		ChequingAccount chequingAccount = new ChequingAccount(customer1);
		testAccount(chequingAccount);

		DailyInterestAccount dailyInterestAccount = new DailyInterestAccount(customer1);
		testAccount(dailyInterestAccount);

		
		System.exit(0);
		
	}

	/**
	 * Method to test all behaviors of a bank account
	 * @param account the account to be tested
	 */
	public static void testAccount(BankAccount account)	{
		if(account instanceof SavingsAccount) {
			System.out.println("Bank account owner is " + account.accountOwner());
			double openingBalance = account.balance;
			
			double depositAmount1 = 1000.50;
			double depositAmount2 = 55.75;
			double withDrawalAmount1 = 500.75;
			double withDrawalAmount2 = 1500.00;
			
			System.out.println("Account Class:" + account.getClass().getName());
			System.out.println("depositing:" + depositAmount1 + "  balance: " + account.deposit(depositAmount1));
			System.out.println("deposit of " + depositAmount1 + "  EXPECTED balance of "  + (openingBalance + depositAmount1) + "  BALANCE is:" + account.balance);

			
			System.out.println("depositing:" + depositAmount2 + "  balance: " + account.deposit(depositAmount2));
			System.out.println("deposit of " + depositAmount2 + "  EXPECTED balance of " + ( depositAmount1 + depositAmount2) + "  BALANCE is:" + account.balance);

			openingBalance = account.balance;
			System.out.println("with drawing :" + withDrawalAmount1 + "  balance: " + account.withDraw(withDrawalAmount1));
			System.out.println("Withdrawal of " + depositAmount1 + "  EXPECTED balance of " + (openingBalance - withDrawalAmount1) + "  BALANCE is:" + account.balance);

			System.out.println("with drawing :" + withDrawalAmount2 + "  balance: " + account.withDraw(withDrawalAmount2) + " EXPECTED RESULT: Not enough balance");
			
			openingBalance = account.balance;
			System.out.println("Calculating service charge of 5.00 new blance is " + account.calculateServiceCharge() + "  EXPECTED RESULT: " + (openingBalance + 5.0));
			System.out.println("\n\nTesting of SavingsAccount class complete ******");
		
		}else if (account instanceof ChequingAccount) {
			System.out.println("Bank account owner is " + account.accountOwner());
			double openingBalance = account.balance;
			
			double depositAmount1 = 1000.50;
			double depositAmount2 = 55.75;
			double withDrawalAmount1 = 500.75;
			double withDrawalAmount2 = 1500.00;
			
			System.out.println("Account Class:" + account.getClass().getName());
			System.out.println("depositing:" + depositAmount1 + "  balance: " + account.deposit(depositAmount1));
			System.out.println("deposit of " + depositAmount1 + "  EXPECTED balance of "  + (openingBalance + depositAmount1) + "  BALANCE is:" + account.balance);

			
			System.out.println("depositing:" + depositAmount2 + "  balance: " + account.deposit(depositAmount2));
			System.out.println("deposit of " + depositAmount2 + "  EXPECTED balance of " + ( depositAmount1 + depositAmount2) + "  BALANCE is:" + account.balance);

			openingBalance = account.balance;
			System.out.println("with drawing :" + withDrawalAmount1 + "  balance: " + account.withDraw(withDrawalAmount1));
			System.out.println("Withdrawal of " + depositAmount1 + "  EXPECTED balance of " + (openingBalance - withDrawalAmount1) + "  BALANCE is:" + account.balance);

			System.out.println("with drawing :" + withDrawalAmount2 + "  balance: " + account.withDraw(withDrawalAmount2) + " EXPECTED RESULT: Not enough balance");
			
			openingBalance = account.balance;
			System.out.println("Calculating service charge of 10.00 new balance is " + account.calculateServiceCharge() + "  EXPECTED RESULT: " + (openingBalance + 10.0));
			System.out.println("\n\nTesting of ChequingAccount class complete ******");
		
		}else if (account instanceof DailyInterestAccount) {
			System.out.println("Bank account owner is " + account.accountOwner());
			double openingBalance = account.balance;
			
			double depositAmount1 = 1000.50;
			double depositAmount2 = 55.75;
			double withDrawalAmount1 = 500.75;
			double withDrawalAmount2 = 1500.00;
			
			System.out.println("Account Class:" + account.getClass().getName());
			System.out.println("depositing:" + depositAmount1 + "  balance: " + account.deposit(depositAmount1));
			System.out.println("deposit of " + depositAmount1 + "  EXPECTED balance of "  + (openingBalance + depositAmount1) + "  BALANCE is:" + account.balance);

			
			System.out.println("depositing:" + depositAmount2 + "  balance: " + account.deposit(depositAmount2));
			System.out.println("deposit of " + depositAmount2 + "  EXPECTED balance of " + ( depositAmount1 + depositAmount2) + "  BALANCE is:" + account.balance);

			openingBalance = account.balance;
			System.out.println("with drawing :" + withDrawalAmount1 + "  balance: " + account.withDraw(withDrawalAmount1));
			System.out.println("Withdrawal of " + depositAmount1 + "  EXPECTED balance of " + (openingBalance - withDrawalAmount1) + "  BALANCE is:" + account.balance);

			System.out.println("with drawing :" + withDrawalAmount2 + "  balance: " + account.withDraw(withDrawalAmount2) + " EXPECTED RESULT: Not enough balance");
			
			openingBalance = account.balance;
			System.out.println("Calculating service charge of 2% of 555.5 (11.11) new balance is " + account.calculateServiceCharge() + "  EXPECTED RESULT: " + (openingBalance + 11.11));
			System.out.println("\n\nTesting of DailyInterestAccount class complete ******");
		}
		
	}

}
