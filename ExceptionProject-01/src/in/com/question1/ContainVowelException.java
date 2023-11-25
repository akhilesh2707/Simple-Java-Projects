package in.com.question1;

public class ContainVowelException extends Exception {

	private static final long serialVersionUID = -2815547170015492730L;
	private String message;

	public ContainVowelException() {
		message = "Your string contained vowel please correct it!...";
	}

	public ContainVowelException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "ContainVowelException : " + message;
	}

}
