import java.util.Scanner;

public class TestProjectApp {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println();
		System.out.println(24);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter something:");
		String s1 = sc.nextLine();
		
		System.out.println("s1 = "+s1);
		
		System.out.println("Enter something else:");
		String s2 = sc.next();
		
		System.out.println("s2 = "+s2);
		
		System.out.println("Enter 3 ints:");
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		
		System.out.println(i1+","+i2+","+i3);

	}

}
