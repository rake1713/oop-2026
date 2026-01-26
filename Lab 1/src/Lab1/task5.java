package Lab1;


public class task5 {
	public static void main (String[] args) {
		double a = 3452;
        double b = 20;
        double c = a * (b / 100);
        double d = a + c;
        System.out.println("--- Account information ---");
        System.out.println("Initial balance " + a);
        System.out.println("c rate: " + b + "%");
        System.out.println("c accrued: " + c);
        System.out.println("--------------------------");
        System.out.println("New balance " + d);
}	
}