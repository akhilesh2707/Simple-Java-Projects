package in.com.question4;

public class MainApp {

	public static void main(String[] args) {
		
		Account savingAccount = new SavingAccount(6000);
		savingAccount.deposit(1500);
		savingAccount.withdraw(2000);
		System.out.println("Your SavingAccount interest is :: " + savingAccount.calcuteInterest());
		System.out.println("Your SavingAccount current balance is :: " + savingAccount.checkBalance());
		
		System.out.println("*************************************************************************");
		
		Account currentAccount = new CurrentAccount(8000);
		currentAccount.deposit(10500);
		currentAccount.withdraw(20000);
		System.out.println("Your CurrentAccount interest is :: " + currentAccount.calcuteInterest());
		System.out.println("Your CurrentAccount current balance is :: " + currentAccount.checkBalance());
	}

}
