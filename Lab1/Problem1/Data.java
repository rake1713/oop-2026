package Problem1;

public class Data{
    private double summ;
    private double maxx;
    private int count;

    public Data(){
        this.summ=0;
        this.maxx=0;
        this.count=0;
    }
    public void add(double a){
        summ += a;
        if (maxx<a) maxx=a;
        ++count;
    }
    public double getAverage(){
        if (count==0) return 0;
        else {
            double avg = summ/count;
            return avg;
        }
    }
    public double getMaximum(){
        return this.maxx;
    }
}