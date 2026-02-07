package Problem4;
import java.util.ArrayList;
import java.util.Scanner;
import Practice2.Student;

public class GradeBook {
    private Course c;
    ArrayList <Student> ss;

    public GradeBook(Course crs){
        this.c=crs;
        this.ss = new ArrayList<>();
    }
    public void addStudent(Student st){
        ss.add(st);
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book  "+c.getName());
    }

    public double determineAVG(){
        double avg = 0.0;
        if (ss.isEmpty()) return 0;
        else{
            for(Student s:ss){
                avg+=s.getGrade();
            }
            return avg/ss.size();
        }
    }

    public Student getBest(){
        if (ss.isEmpty())return null;
        Student b = ss.get(0);
        for (Student s:ss){
            if(s.getGrade()>b.getGrade()) b=s;
        }
        return b;
    }
    public Student getWorst(){
        if (ss.isEmpty()) return null;
        Student worst = ss.get(0);
        for (Student s : ss) {
            if (s.getGrade() < worst.getGrade()) {
                worst = s;
            }
        }
        return worst;
    }
    public void outputBarChart(){
        String s0 = "", s10 = "", s20 = "", s30 = "", s40 = "", s50 = "", 
           s60 = "", s70 = "", s80 = "", s90 = "", s100 = "";
        for (Student s:ss){
            double g = s.getGrade();
        
            if (g == 100) s100 += "*";
            else if (g >= 90) s90 += "*";
            else if (g >= 80) s80 += "*";
            else if (g >= 70) s70 += "*";
            else if (g >= 60) s60 += "*";
            else if (g >= 50) s50 += "*";
            else if (g >= 40) s40 += "*";
            else if (g >= 30) s30 += "*";
            else if (g >= 20) s20 += "*";
            else if (g >= 10) s10 += "*";
            else s0 += "*";
    }
        System.out.println("00-09: " + s0);
        System.out.println("10-19: " + s10);
        System.out.println("20-29: " + s20);
        System.out.println("30-39: " + s30);
        System.out.println("40-49: " + s40);
        System.out.println("50-59: " + s50);
        System.out.println("60-69: " + s60);
        System.out.println("70-79: " + s70);
        System.out.println("80-89: " + s80);
        System.out.println("90-99: " + s90);
        System.out.println("100: " + s100);
}
    public void displayGradeReport(){
        displayMessage();
        System.out.println("Class average: "+determineAVG());
        if (getBest()!=null) System.out.println("Highest grade is "+getBest().getGrade()+"(Student "+getBest().getName()+"), id: "+getBest().getId());
        if (getWorst()!=null) System.out.println("Lowest grade is "+getWorst().getGrade()+"(Student "+getWorst().getName()+"), id: "+getWorst().getId());
        System.out.println();
        System.out.println("Grade distribution:");
        outputBarChart();
    }
    public String toString(){
        return "Welcome to the grade book "+"\n"+c.toString()+"\n"+ss.toString();
    }

}
