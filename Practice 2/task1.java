import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);  
        String name = s.next();
        int id = s.nextInt();       
        Student s1=new Student(name, id);
        System.out.println("Name: "+s1.getName());
        System.out.println("Student ID: "+s1.getId());
        s1.incrementSy();
        System.out.println("Year of study: "+s1.getSy());
    }
}

class Student{
    private String name;
    private int id;
    private int study_year;

    public Student(String n,int i){
        this.name=n;
        this.id=i;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSy(){
        return study_year;
    }
    public int incrementSy(){
        return ++study_year;
    }
}