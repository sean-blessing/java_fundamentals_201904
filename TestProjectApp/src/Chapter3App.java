import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3App {

	public static void main(String[] args) {
//		int i = 4;
//		double d = 4.5;
//		d += i;
		
//		Scanner sc = new Scanner(System.in);
//		String again = "y";
//		while (again.equalsIgnoreCase("y")) {
//			int d = (int)(Math.random()*10)+1;
//			System.out.println(d);
//			System.out.println("Again?");
//			again = sc.next();
//		}
		
		double d1 = 45.6734556;
		double d2 = 5670.325678;
		double d3 = 3422.139999;
		double p1 = .035;
		double p2 = .019999;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		
		System.out.println(cf.format(d1));
		System.out.println(cf.format(d2));
		System.out.println(cf.format(d3));

		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		System.out.println(pf.format(p1));
		System.out.println(pf.format(p2));
	}

}
