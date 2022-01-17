package Software;

public class Worker {
	public String name, surname, department;
	public int age;
	private static int number_of_worker = 0;
	
	public Worker(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		number_of_worker++;
	}

	public Worker(String name, String surname) {
		this.name = name;
		this.surname = surname;
		number_of_worker++;
	}
	
	public void PrintInformations() {
		System.out.println(name + " " + surname + " " + age);
		System.out.println("----------------------------------");
	}
	
	final public void NumberOfEmployees() {
		System.out.println("Number Of Employees: " + number_of_worker);
		System.out.println("----------------------------------");
	}

	public int getNumber_of_worker() {
		return number_of_worker;
	}

	public void setNumber_of_worker(int number_of_worker) {
		Worker.number_of_worker = number_of_worker;
	}
	
	
	
}
