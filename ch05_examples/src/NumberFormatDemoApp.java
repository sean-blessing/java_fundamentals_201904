import java.text.NumberFormat;

public class NumberFormatDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//double sales = Console.getDouble("Sales?");
			//Console c = new Console();
			//double sales = c.getDouble("Sales?");
			double sales1 = Console.getDouble("Sales?");
			double sales2 = Console.getDouble("Sales?");
			double sales3 = Console.getDouble("Sales?");
			
			double total = sales1 + sales2 + sales3;
			
			NumberFormat cf = NumberFormat.getCurrencyInstance();
			String sf = cf.format(total);
			System.out.println("sales1: "+cf.format(sales1));
			System.out.println("sales2: "+cf.format(sales2));
			System.out.println("sales3: "+cf.format(sales3));
			System.out.println("Total sales:  "+sf);
			choice = Console.getString("Continue?");
		}
		
		

		System.out.println("Bye");
	}

}
