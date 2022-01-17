package School;

public class Student {
	private int ID;
	private String name, surname;
	private int _final, midterm;
	private static int iD = 0;
	
	public Student(String name, String surname, int _final, int midterm) {
		this.name = name;
		this.surname = surname;
		this._final = _final;
		this.midterm = midterm;
		this.ID = ++iD;
	}
	
	public void PrintInformations() {
		System.out.println(ID + " " + name + " " + surname + " " + midterm + " " +_final);
		System.out.println("Passing Score: " + CalculatePassingScore(midterm, _final));
	}
	
	public double CalculatePassingScore(int midterm, int _final) {
		double passing_score = (midterm*0.4) + (_final*0.6);
		return passing_score;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
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
	public int get_final() {
		return _final;
	}
	public void set_final(int _final) {
		this._final = _final;
	}
	public int getMidterm() {
		return midterm;
	}
	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}
}
