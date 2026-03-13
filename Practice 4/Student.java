public class Student extends Person implements CanHaveParty, CanHavePizza, CanHaveRetake, Movable {
    private int yearOfCourse;
    private String major;
    public Student(String n, int a, String g,int yoc, String m){
        super(n,a,g);
        this.yearOfCourse=yoc;
        this.major=m;
    }
    @Override
    public void eatPizza(){
        System.out.println("Студент " +super.getName()+ " ест пиццу");
    }
    @Override
    public  void move(){
        System.out.println("Студент "+super.getName()+ " движется");
    }
    @Override
    public void dance(){
        System.out.println("Студент " +super.getName()+ " танцует");
    }
    @Override
    public void retakeExam(){
        System.out.println("У студента " +super.getName()+ " есть ретейк надо пересдавать экзамен");
    }
    @Override
    public String toString(){
        return super.toString()+"\nYear of course: "+yearOfCourse+"\nMajor: "+major;
    }
}
