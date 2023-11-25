package in.com.question2;

public class CheckingAccount extends BankAccount {

	private float currentBalance;

	public CheckingAccount() {

	}

	public CheckingAccount(float openingBalance) {
		super(openingBalance);
		currentBalance = openingBalance;
	}

	@Override
	public void deposit(float amount) {
		currentBalance += amount;
		System.out.println("Money Deposit Successfully...");
	}

	@Override
	public void withdraw(float amount) {
		if (currentBalance > amount) {
			currentBalance -= amount;
			System.out.println("Money Withdrawn Successfully...");
		} else {
			System.out.println("Insufficient Balance!...");
		}
	}

	@Override
	public float checkBalance() {
		return currentBalance;
	}

}
