package in.com.assignment3;

//Modified BankAccount class
class BankAccount implements BankOperations {
	private String accountHolderName;
	private BankName bankName;
	private double accountBalance;

	// Constructor
	public BankAccount(double initialBalance, String accountHolderName, BankName bankName) {
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountBalance = initialBalance;
	}

	@Override
	public double getBalance() {
		return accountBalance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			accountBalance += amount;
			System.out.println("Deposited Rs." + amount + " into " + accountHolderName + "'s account. New balance: Rs."
					+ accountBalance);
		} else {
			System.out.println("Invalid deposit amount. Please deposit a positive amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("Withdrawn Rs." + amount + " from " + accountHolderName + "'s account. New balance: Rs."
					+ accountBalance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}

	// Method to calculate total interest
	public void calculateInterest(int numberOfYears) {
		double totalInterest = bankName.getInterestRate() * numberOfYears * accountBalance;
		System.out.println("Total interest for " + accountHolderName + "'s account in " + bankName + " after "
				+ numberOfYears + " years: Rs. " + totalInterest);
	}

	public static void main(String[] args) {
		// Create three bank accounts with different banks
		BankAccount iciciAccount = new BankAccount(1000.0, "Sumit Kumar", BankName.ICICI);
		BankAccount hdfcAccount = new BankAccount(1500.0, "Amit Jain", BankName.HDFC);
		BankAccount sbiAccount = new BankAccount(2000.0, "Rohit Rawat", BankName.SBI);

		System.out.println("*********************************************************************");
		
		// Print the bank name for each account
		System.out.println(
				"ICICI Account Holder: " + iciciAccount.accountHolderName + ", Bank Name: " + iciciAccount.bankName);
		System.out.println(
				"HDFC Account Holder: " + hdfcAccount.accountHolderName + ", Bank Name: " + hdfcAccount.bankName);
		System.out
				.println("SBI Account Holder: " + sbiAccount.accountHolderName + ", Bank Name: " + sbiAccount.bankName);

		System.out.println("*********************************************************************");
		
		// Deposit and withdraw money for each account
		iciciAccount.deposit(500.0);
		iciciAccount.withdraw(200.0);

		hdfcAccount.deposit(1000.0);
		hdfcAccount.withdraw(700.0);

		sbiAccount.deposit(800.0);
		sbiAccount.withdraw(300.0);

		System.out.println("*********************************************************************");
		
		// Calculate and print total interest for each account
		iciciAccount.calculateInterest(3);
		hdfcAccount.calculateInterest(2);
		sbiAccount.calculateInterest(5);
	}

}
