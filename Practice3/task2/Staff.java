package task2;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String n, String a, String sc, double p){
        super(n,a);
        this.school=sc;
        this.pay=p;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }
    
    public void setPay(double pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        return "Staff [ "+super.toString()+", school= "+this.school+", pay= "+this.pay+" ]";
    }
}
