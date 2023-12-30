package in.basic.question1;

public class Student {

	private int studentId;
	private String studentName;
	private String collegeName;

	public Student(int studentId, String studentName, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeName=" + collegeName
				+ "]";
	}

	public static void main(String[] args) {

		System.out.println("*********************************");
		Student student = new Student(1001, "Rahul", "AVM College");
		System.out.println(student);
		System.out.println("Successful");

	}

}
