package Student;

public class Student {
	private static int ID = 0;
	private String name;
	private String surname;
	private int Midterm;
	private int Final;
	
	public Student(String name, String surname, int midterm, int final_) {
		this.name = name;
		this.surname = surname;
		Midterm = midterm;
		Final = final_;
		ID++;
	}
	
	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getMidterm() {
		return Midterm;
	}



	public void setMidterm(int midterm) {
		Midterm = midterm;
	}

	public int getFinal() {
		return Final;
	}

	public void setFinal(int final1) {
		Final = final1;
	}

	public void PrintInformation() {
		System.out.print("Student ID: " + ID + "\nStudent Name: " + name + "\nStudent Surname: " + surname + "\nStudent Midterm Exam: " + Midterm + "\nStudent Final Exam: " + Final);
	}
	
	public double CalculatePassingScore(int Midterm, int Final) {
		double passing_score = Midterm * 0.4 + Final * 0.6;
		System.out.print("\nStudent Passing Score: " + passing_score);
		return passing_score;
	}
	
	public void CalculateLetterGrade(double passing_score) {
		String letter;
		if(passing_score <= 100 && passing_score >= 90) {
			letter = "AA";
		}
		else if(passing_score < 90 && passing_score >= 85) {
			letter = "BA";
		}
		else if (passing_score < 85 && passing_score >= 80) {
			letter = "BB";
		}
		else if (passing_score < 80 && passing_score >= 70) {
			letter = "CB";
		}
		else if (passing_score < 70 && passing_score >= 60) {
			letter = "CC";
		}
		else if (passing_score < 60 && passing_score >= 50) {
			letter = "DC";
		}
		else if (passing_score < 50 && passing_score >= 40) {
			letter = "DD";
		}
		else {
			letter = "FF";
		}
		System.out.print("\nStudent Letter Grade: " + letter + "\n----------------------------------\n");
	}
}
