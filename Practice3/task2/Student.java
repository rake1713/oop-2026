package task2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String n, String a,String p,int y,double f){
        super(n,a);
        this.program=p;
        this.year=y;
        this.fee=f;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString(){
        return "Student [ "+super.toString()+",program= "+this.program+", year= "+this.year+", fee= "+this.fee+" ]";
    }
}
