public class task3 {
    public static void main(String[] args) {
        Time t=new Time(00, 19, 45);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());
        Time t2=new Time(12, 40, 15);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());

    }
}


class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s){
        this.hour=h;
        this.minute=m;
        this.second=s;
    }
    public String toUniversal() {
        String a="";
        a += (hour < 10 ? "0" : "") + hour + ":";
        a += (minute < 10 ? "0" : "") + minute + ":";
        a += (second < 10 ? "0" : "") + second;
        return a;
    }
    public String toStandart(){
        String s="";
        int h12=hour%12;
        if (h12 == 0) h12 = 12; 
        String period = (hour < 12) ? " AM" : " PM";
        s += (h12 < 10 ? "0" : "") + h12 + ":";
        s += (minute < 10 ? "0" : "") + minute + ":";
        s += (second < 10 ? "0" : "") + second + period;
        return s;
    }
    public void add (Time t2){
        this.second += t2.second;
        this.minute += this.second / 60;
        this.second %= 60;            

        this.minute += t2.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;              

        this.hour += t2.hour;
        this.hour %= 24;
    }
}