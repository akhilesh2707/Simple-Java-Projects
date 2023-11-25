package in.com.question2;

public class ContainOddNumberException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public ContainOddNumberException() {
		super();
		message = "Contained Odd Number, Please Correct it!...";
	}

	public ContainOddNumberException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "ContainOddNumberException : " + message;
	}

}
