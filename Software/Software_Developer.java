package Software;

public class Software_Developer extends Worker{
	private int ID;
	private static int iD = 0;
	public int term_of_office;
	
	public Software_Developer(String name, String surname, int age, int term_of_office) {
		super(name, surname, age);
		this.term_of_office = term_of_office;
		this.ID = ++iD;
		this.department = "Software Developer";
	}

	public void PrintInformations() {
		System.out.println(ID + " " + name + " " + surname + " " + age + " " + department + " " + term_of_office);
		System.out.println("----------------------------------");
	}
	
	public void CalculateIncrease() {
		float increase;
		if(term_of_office > 10)
			increase = age*30/100;
		else if (term_of_office > 20)
			increase = age*40/100;
		else
			increase = age*10/100;
		
		System.out.println("Salary Increase: " + increase);
		System.out.println("----------------------------------");
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
