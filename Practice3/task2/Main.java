package task2;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Vector<Person> list= new Vector<>();
        while (true){
            System.out.println("\nFor add new person: 1 \nFor print all list: 2 \nExit: 3");
            int cmnd=s.nextInt();
            if (cmnd==1){
                System.out.println("Who are we adding?( Person: 1,  Student: 2,  Staff: 3");
                int type=s.nextInt();
                s.nextLine();
                System.out.print("Name: ");
                String name=s.nextLine();
                System.out.print("Address: ");
                String address=s.nextLine();
                
                if (type == 1){
                    list.add(new Person(name, address));
                }
                else if (type == 2){
                    System.out.print("Program: ");
                    String program=s.nextLine();
                    System.out.print("Year: ");
                    int year=s.nextInt();
                    System.out.print("Fee: ");
                    double fee=s.nextDouble();
                    s.nextLine();
                    list.add(new Student(name,address,program,year,fee));
                }
                else if (type == 3){
                    System.out.print("School: ");
                    String school=s.nextLine();
                    System.out.print("Pay: ");
                    double pay=s.nextDouble();
                    s.nextLine();
                    list.add(new Staff(name,address,school,pay));
                }
            }
            else if (cmnd == 2){
                for (Person p:list){
                    System.out.println(p);
                }
            }
            else{
                break;
            }
        }
    }
}
