package Problem1;
import java.util.Scanner;
//made by Rake1713

public class Analyzer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Data d = new Data();
        while(true){
            System.out.print("Enter number (Q to quit): ");
            String api = s.nextLine();
            if (api.equalsIgnoreCase("Q")) {
                break;
            }
            else{
                try{
                    d.add(Double.parseDouble(api));
                }
                catch (NumberFormatException e){
                    System.out.println("Incorrect input!!! Please enter a number or Q.");
                }
            }
        }
        double avg = d.getAverage();
        if (avg==0) System.out.println("Average: " + 0);
        else System.out.println("Average: " + d.getAverage());
        System.out.println("Maximum: " + d.getMaximum());
    }
}

