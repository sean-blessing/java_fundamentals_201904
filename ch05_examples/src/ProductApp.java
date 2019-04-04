
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Product p1 = new Product("java", "Murach's Java", 59.50);
		Product p2 = new Product("jsp", "Murach's JSP", 55.0);
		Product p3 = new Product();
		p3.setCode("html");
		p3.setDescription("Murach's HTML");
		p3.setPrice(56.5);
		
		System.out.println("p1: "+p1.getCode());
		System.out.println("p3: "+p3.getCode());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("Bye");
	}

}
