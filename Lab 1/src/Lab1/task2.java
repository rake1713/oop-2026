package Lab1;
import java.util.Scanner;

public class task2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("Perimeter: "+(4*a));
		System.out.println("Area: "+(a*a));
		System.out.println("Diagonal: "+(Math.sqrt(2)*a));
}	
}