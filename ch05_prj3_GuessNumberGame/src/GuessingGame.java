import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++ \n");

		Scanner sc = new Scanner(System.in);
		String choice = "y";


		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to 100. \nTry to guess it\n");
			int count = 0;

			int number = getRandomInt(100);
			System.out.println(number);
			int guess = 0;

			while (guess != number) {
				guess = getIntWithinRange(sc, "Enter number: ", 0, 101);
				count++;
				
				int diff = guess - number;
				String message="";
				
				if (diff > 10) {
					message = "Way too high!";
				}
				else if (diff < -10) {
					message = "Way too low!";
				}
				else if (diff < 0) {
					message = "Too Low!";
				}
				else if (diff > 0 ) {
					message = "Too high!";
				}
				else {
					// User guessed the number
					message  += "You got it in "+count+" tries.\n";
					if(count <= 3) {
						message += "Great work! You are a mathematical wizard";
					}
					else if(count > 3&& count<= 7) {
						message += "Not too bad! You've got some potential.";
					}
					else {	
						message += "What took you so long? Maybe you should take some lessons";
					}
					
				}
				System.out.println(message);
			}
			System.out.println("Continue?(y/n):");
			choice = sc.next();
		}
		sc.close();

	}

	public static int getRandomInt(int limit) {

		double num = Math.random() * limit;
		int randomInt = (int) num;
		randomInt++;
		return randomInt;

	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}

}
