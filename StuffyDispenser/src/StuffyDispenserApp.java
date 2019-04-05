
public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//			String type = Console.getString("What type(bear, ball or cat) of stuffy?  ");
//			
//			Stuffy s = new Stuffy("red",type, "small");
//			
//			
//			
//			System.out.println("Congratulations!  You got a stuffy!!  "+s);
//			
//			choice = Console.getString("Again??  ");
//		}
		
		Stuffy s1 = new Stuffy("red", "bear", "small");
		Stuffy s2 = new Stuffy("red", "bear", "small");
		
		if (s1.equals(s2)) {
			System.out.println("same stuffy");
		}
		else {
			System.out.println("different stuffies");
		}
		System.out.println("Bye");
	}

}
