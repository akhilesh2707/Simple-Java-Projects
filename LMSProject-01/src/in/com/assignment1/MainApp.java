package in.com.assignment1;

public class MainApp {

	public static void main(String[] args) {
		// Create three bank accounts
		BankAccount iciciAccount = new BankAccount("Rahul", "ICICI", 1000.0);
		BankAccount hdfcAccount = new BankAccount("Sunil", "HDFC", 1500.0);
		BankAccount sbiAccount = new BankAccount("Bobby", "SBI", 2000.0);

		// Deposit and withdraw money for each account
		iciciAccount.deposit(500.0);
		iciciAccount.withdraw(200.0);

		hdfcAccount.deposit(1000.0);
		hdfcAccount.withdraw(700.0);

		sbiAccount.deposit(800.0);
		sbiAccount.withdraw(300.0);

		// Display the account balances
		System.out.println("ICICI Account Balance: Rs." + iciciAccount.getBalance());
		System.out.println("HDFC Account Balance: Rs." + hdfcAccount.getBalance());
		System.out.println("SBI Account Balance: Rs." + sbiAccount.getBalance());
	}

}
