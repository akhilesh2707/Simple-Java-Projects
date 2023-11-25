package in.com.question3;

public class StudentB extends Marks {

	private int hindiMarks;
	private int englishMarks;
	private int mathsMarks;
	private int computerMarks;

	public StudentB() {
		super();
	}

	public StudentB(int hindiMarks, int englishMarks, int mathsMarks, int computerMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.computerMarks = computerMarks;
	}

	@Override
	public float getPercentage() {
		return (hindiMarks + englishMarks + mathsMarks + computerMarks) * 100 / 400;
	}

}
