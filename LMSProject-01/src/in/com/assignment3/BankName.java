package in.com.assignment3;

public enum BankName {

	ICICI(6.3), HDFC(5.8), SBI(6.0);

	private double interestRate;

	// Constructor for the enum
	BankName(double interestRate) {
		// System.out.println("BankName is called by :: " + this);
		this.interestRate = interestRate;
	}

	// Getter method for interestRate
	public double getInterestRate() {
		return interestRate;
	}
}
