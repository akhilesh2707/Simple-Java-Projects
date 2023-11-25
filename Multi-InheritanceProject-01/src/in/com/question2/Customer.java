package in.com.question2;

public class Customer {

	public static void main(String[] args) {

		BankAccount saving = new SavingAccount(6000);
		saving.deposit(2000);
		saving.withdraw(6500);
		
		System.out.println("Your saving account current balance is :: " + saving.checkBalance());
		
		System.out.println("********************************************************************");
		
		BankAccount checking = new CheckingAccount(10000);
		checking.deposit(500);
		checking.withdraw(12500);
		
		System.out.println("Your current account current balance is :: " + checking.checkBalance());
		
	}

}
