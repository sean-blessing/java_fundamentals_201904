
public class Product {
	private String code;
	private String description;
	private double price;
	private static int objCount=0;
	
	public static Product getProductInstance() {
		Product p = new Product();
		return p;
	}
	
	public Product() {
		objCount++;
	}

	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
		objCount++;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getObjCount() {
		return objCount;
	}

	public static void setObjCount(int objCount) {
		Product.objCount = objCount;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + ", "
				+ "objCount = "+objCount+"]";
	}

	
	
	
	
	
	
	
	
}
