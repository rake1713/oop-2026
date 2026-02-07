package Problem4;
import java.util.ArrayList;
import java.util.Scanner;
import Practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Course c = new Course("CSCI2106 Object-Oriented Programming and Design" , "OOP",5,"CSCI1204 Programming Principles II ");
        Course d = new Course("Web Development" , "web",5,"ICT");
        GradeBook g = new GradeBook(c);
        GradeBook h = new GradeBook(d);
        ArrayList<Student> tempGroup = new ArrayList<>();
        double finalGrade = -1;
        tempGroup.add(new Student("Ramazan", 24, 2, 0));
        tempGroup.add(new Student("Dias", 25, 2, 0));
        
        System.out.println("\nGrading for " + c.getName());
        for (Student st : tempGroup) {
            while (true) {
                System.out.print("Grade for " + st.getName() + " (0-100): ");
                String input = s.next(); 
                try {
                    finalGrade = Double.parseDouble(input);
                    if (finalGrade < 0 || finalGrade > 100) {
                    System.out.println("Error: Grade must be between 0 and 100!");
                    } else {
                        break; 
                    }
                    } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input! Please enter a numeric value.");
    }
    }
    g.addStudent(new Student(st.getName(), st.getId(), st.getSy(), finalGrade));
}

        System.out.println("\nGrading for " + d.getName());
        for (Student st : tempGroup) {
            while (true) {
                System.out.print("Grade for " + st.getName() + " (0-100): ");
                String input = s.next(); 

                try {
                    finalGrade = Double.parseDouble(input); 

                    if (finalGrade < 0 || finalGrade > 100) {
                    System.out.println("Error: Grade must be between 0 and 100!");
                    } else {
                        break; 
                    }
                    } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input! Please enter a numeric value.");
    }
    }
    h.addStudent(new Student(st.getName(), st.getId(), st.getSy(), finalGrade));
}
        System.out.println("\n===============================");
        g.displayGradeReport();   
        System.out.println("\n===============================");
        h.displayGradeReport();
       
        }
    
}
