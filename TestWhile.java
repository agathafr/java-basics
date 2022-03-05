
public class TestWhile {
	public static void main(String[] args) {
		int counter = 0;
		while (counter <= 10) {
			System.out.println(counter);
			counter = counter + 1;
			counter += 1;
			counter++;
		}
	}
}
