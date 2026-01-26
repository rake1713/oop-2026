package Lab1;
import java.util.Scanner;

public class task6 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String reva = new StringBuilder(a).reverse().toString();
		if (a.equals(reva)) {
			System.out.println("Palindrome :)");
		}else {
			System.out.println("Not palindrome :(");
		}
}
}	