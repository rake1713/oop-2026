package Lab1;
import java.util.Scanner;

public class task4 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = (b*b)-(4*a*c);
		if (d<0) {
			System.out.println("Error: The equation has no real roots");
		}
		else if (d==0) {
			double x = (-b)/(2*a);
			System.out.println("Only one root x = "+x);
		}
		else {
			double dd = Math.sqrt(d);
			double x1 = ((-b)+(dd))/(2*a);
			double x2 = ((-b)-(dd))/(2*a);
			
			System.out.println("X1 = "+x1);
			System.out.println("X2 = "+x2);
		}
	
		
		
}
	}