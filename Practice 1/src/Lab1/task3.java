package Lab1;
import java.util.Scanner;

public class task3 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double[] scores = {94.5, 89.5, 84.5, 79.5, 74.5, 69.5, 64.5, 59.5, 54.5, 49.5};
		String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D"};
		String result = "F"; 
		for (int i = 0; i < scores.length; i++) {
		    if (a >= scores[i]) {
		        result = grades[i];
		        break; 
		    }
		}
		System.out.println(result);
}	
}