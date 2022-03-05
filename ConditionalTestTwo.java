
public class ConditionalTestTwo {
	public static void main(String[] args) {
		System.out.println("Testing conditionals...");
		int age = 18;
		int quantityPeople = 3;
		boolean accompanied = quantityPeople >= 2;
		
		System.out.println("Value of accompanied = " + accompanied);

		if (age >= 18 && accompanied) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Unfortunately you can not enter!");
			}	
		
	
	}
}
