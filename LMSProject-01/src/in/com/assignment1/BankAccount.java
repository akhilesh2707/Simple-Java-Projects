package in.com.assignment1;

public class BankAccount implements BankAccountOperations {

	private String accountHolderName;
	private String bankName;
	private Double accountBalance;

	public BankAccount() {
		super();
	}

	public BankAccount(String accountHolderName, String bankName, Double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountBalance = accountBalance;
	}

	@Override
	public Double getBalance() {
		return accountBalance;
	}

	@Override
	public String deposit(Double amount) {
		if (amount > 0) {
			accountBalance += amount;
			return "Deposited Rs." + amount + " into " + accountHolderName + "'s account. New balance: Rs."
					+ accountBalance;
		} else {
			return "Invalid deposit amount. Please deposit a positive amount.";
		}
	}

	@Override
	public String withdraw(Double amount) {
		if (amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			return "Withdrawn Rs." + amount + " from " + accountHolderName + "'s account. New balance: Rs."
					+ accountBalance;
		} else {
			return "Invalid withdrawal amount or insufficient funds.";
		}
	}

}
