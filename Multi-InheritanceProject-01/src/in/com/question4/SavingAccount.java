package in.com.question4;

public class SavingAccount implements Account {

	private float openingBalance;
	private float currentBalance;

	public SavingAccount() {

	}

	public SavingAccount(float openingBalance) {
		super();
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
	}

	@Override
	public void deposit(float amount) {
		currentBalance += amount;
		System.out.println("Rs. " + amount + " deposit successfully!...");
	}

	@Override
	public void withdraw(float amount) {
		if (currentBalance >= amount) {
			currentBalance += amount;
			System.out.println("Rs. " + amount + " withdrawn successfully!...");
		} else {
			System.out.println("Insufficient Balance!...");
		}
	}

	@Override
	public float calcuteInterest() {
		return currentBalance * 5 / 100;
	}

	@Override
	public float checkBalance() {
		return currentBalance;
	}

}
