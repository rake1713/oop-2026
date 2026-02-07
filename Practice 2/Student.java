package Practice2;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;
    private double grade;

    public Student(String name, int id, int ys, double grade) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = ys;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSy() {
        return yearOfStudy;
    }

    public double getGrade() {
        return grade;
    }

    public int incrementSy() {
        return ++yearOfStudy;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + "\nId: " + id + "\nYears of study: " + yearOfStudy + "\nGrade: " + grade;
    }
}
