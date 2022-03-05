
public class ConditionalTest {
	public static void main(String[] args) {
		System.out.println("Testing conditionals...");
		int age = 16;
		int quantityPeople = 3;

		if (age >= 18) {
			System.out.println("You are over 18 years old.");
			System.out.println("Welcome!");
		} else {
			if(quantityPeople >= 2) {
				System.out.println("You can not over 18 years old but can enter "
						+ "because you are accompanied. Welcome!");
			} else {
				System.out.println("Unfortunately you can not enter!");
			}
			
		}
	}
}
