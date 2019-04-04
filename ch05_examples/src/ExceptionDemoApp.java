

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		while (!choice.equalsIgnoreCase("n")) {
			double a = 0.0;
			while (true) {
				System.out.println("Enter an number");
				try {
					a = sc.nextDouble();
					break;
				}
				catch (InputMismatchException ime) {
					System.out.println("Sorry...  invalid input.  Try again.");
					sc.nextLine();
				}
				catch (Exception e) {
					System.out.println("Exception occurred.  Please call help desk.");
					sc.nextLine();
				}
			}
			System.out.println("You entered: "+a);
		}
		System.out.println("Bye");

	}

}
