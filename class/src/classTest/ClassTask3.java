package classTest;
class Student{
	int studentNumber;
	int korScore;
	int engScore;
	int mathScore;
	
	public Student(int studentNumber, int korScore, int engScore, int mathScore) {
		this.studentNumber = studentNumber;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	int total() {
		return korScore+engScore+mathScore;
	}
	
	double avg() {
		return total()/3.0;
	}
}


public class ClassTask3 {
	public static void main(String[] args) {
		Student student = new Student(1, 50, 30, 60);
		System.out.println(student.total());
		System.out.println(student.avg());
	}
}
