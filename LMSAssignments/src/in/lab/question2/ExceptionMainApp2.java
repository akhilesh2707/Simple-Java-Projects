package in.lab.question2;

class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	InsufficientBalanceException() {
		message = "Insufficient Balance";
	}

	InsufficientBalanceException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

class BankAccount {

	private float balance;

	public BankAccount(float balance) {
		this.balance = balance;
	}

	public void deposit(float amount) {
		balance += amount;
		System.out.println("Amount deposited successfully");
	}

	public void withdraw(float amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Withdrawal amount exceeds the balance");
		}
		balance -= amount;
		System.out.println("Amount withdrawn successfully");
	}

	public float checkBalance() {
		return balance;
	}

}

public class ExceptionMainApp2 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(5000);
		account.deposit(2000);

		try {
			account.withdraw(2000);
			System.out.println("Remaining balance: " + account.checkBalance());
			account.withdraw(7000); // This should throw an exception
		} catch (InsufficientBalanceException ibe) {
			System.out.println("Error: " + ibe.getMessage());
		}

		System.out.println("Current Balance is :: " + account.checkBalance());
	}
}
