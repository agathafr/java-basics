
public class Aliquot {
	public static void main(String[] args) {
		
		double salary = 3751.01;
		
		if (salary >= 1900.0 && salary <= 2800.0) {
			System.out.println("You can deduct in the declaration the amount of R$142.");
		} else {
			if (salary >= 2800.01 && salary <= 3751.0) {
				System.out.println("You can deduct in the declaration the amount of R$350.");
			} else {
				if (salary >= 3751.01 && salary <= 4664.00) {
					System.out.println("You can deduct in the declaration the amount of R$636.");
				}
			}
		} 
	}
}
