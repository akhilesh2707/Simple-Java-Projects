package in.com.question2;

public abstract class BankAccount {
	
	protected float openingBalance;
	
	public BankAccount() {
		
	}

	public BankAccount(float openingBalance) {
		super();
		this.openingBalance = openingBalance;
	}
	
	public abstract void deposit(float amount);
	
	public abstract void withdraw(float amount);
	
	public abstract float checkBalance();

}
