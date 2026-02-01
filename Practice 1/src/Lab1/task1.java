package Lab1;
import java.util.Scanner;

public class task1 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = "-";
		System.out.println("+"+b.repeat(a.length())+"+");
		System.out.println("+"+a+"+");
		System.out.println("+"+b.repeat(a.length())+"+");
}
}	