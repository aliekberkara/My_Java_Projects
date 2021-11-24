package Smart_Phone;

public class Generate_Object {

	public static void main(String[] args) {
		Smart_Phone object1 = new Smart_Phone("Samsung","S21", "Blue", 16, 2.3);
		Smart_Phone object2 = new Smart_Phone();
		object1.Print_Information();
		object1.Evaluate_Memory(object1.getSpeed());

		object2.Print_Information();
		object2.Evaluate_Memory(object2.getSpeed());

	}

}
