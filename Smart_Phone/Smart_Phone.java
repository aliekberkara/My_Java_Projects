package Smart_Phone;

public class Smart_Phone {
	private String trademark;
	private String model;
	private String color;
	private int memory;
	private double speed;

	public Smart_Phone(String trademark, String model, String color, int memory, double speed) {
		super();
		this.trademark = trademark;
		this.model = model;
		this.color = color;
		this.memory = memory;
		this.speed = speed;
	}
	public  Smart_Phone() {
		this.trademark = "Not defined.";
		this.model = "Not defined";
		this.color = "Blue";
		this.memory = 0;
		this.speed = 0.0;
	}
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void Print_Information() {
		System.out.println("Trademark: "+ trademark);
		System.out.println("Model: "+ model);
		System.out.println("Color: "+ color);
		System.out.println("Memory: "+ memory);
		System.out.println("Speed: "+ speed);
	}
	public void Evaluate_Memory(double phone_memory) {
		if (phone_memory >= 32) {
			System.out.println("Phone memory is sufficient.");
		}
		else {
			System.out.println("Phone Memory Is Insufficient.");
		}
	}
}
