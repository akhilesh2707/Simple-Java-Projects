package in.com.question3;

public class StudentA extends Marks {

	private int hindiMarks;
	private int englishMarks;
	private int mathsMarks;

	public StudentA() {
		super();
	}

	public StudentA(int hindiMarks, int englishMarks, int mathsMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public float getPercentage() {
		return (hindiMarks + englishMarks + mathsMarks) * 100 / 300;
	}

}
