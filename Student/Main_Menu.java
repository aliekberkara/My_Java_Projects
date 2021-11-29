package Student;

public class Main_Menu {
	public static void main(String[] args) {
		Student student = new Student("Ali Ekber", "Kara", 75, 63);
		student.PrintInformation();
		student.CalculateLetterGrade(student.CalculatePassingScore(student.getMidterm(), student.getFinal()));
		Student student2 = new Student("Nursena", "Kara", 85, 99);
		student2.PrintInformation();
		student2.CalculateLetterGrade(student.CalculatePassingScore(student.getMidterm(), student.getFinal()));
	}
}
