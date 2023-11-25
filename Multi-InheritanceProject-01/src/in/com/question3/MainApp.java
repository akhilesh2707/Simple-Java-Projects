package in.com.question3;

public class MainApp {

	public static void main(String[] args) {

		Marks studentA = new StudentA(90, 70, 80);
		System.out.println("Percentage of StudentA of 3 subjects :: " + studentA.getPercentage());
		
		System.out.println("**********************************************************************");
		
		Marks studentB = new StudentB(60, 90, 80, 80);
		System.out.println("Percentage of StudentB of 4 subjects :: " + studentB.getPercentage());

	}

}
