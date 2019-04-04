

public class StaticMethodDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		printMessage();
		System.out.println("Bye");
	}

	private static void printMessage() {
		System.out.println("Hello there.  How's it going?");
	}
}
