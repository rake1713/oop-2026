package Problem3;

public class Temperature {
    private double temp;
    private char scale;

    public Temperature(double t, char tt){
        this.temp=t;
        this.scale=tt;
    }
    public Temperature(double t){
        this(t,'C');
    }
    public Temperature(char tt){
        this(0,tt);
    }
    public Temperature(){
        this(0,'C');
    }
    public double getC(){
        if (scale=='C')return temp;
        else temp = 5*(temp-32)/9; scale='C';return temp;
    }
    public double getF(){
        if (scale=='F')return temp+scale;
        else temp = (9*(temp/5))+32; scale='F';return temp;
    }
    public char getScale(){
        return scale;
    }
    public void setTemp(double t){
        this.temp=t;
    }
    public void setScale(char c){
        this.scale=c;
    }
    public void setTemp(double t, char c){
        this.temp=t;
        this.scale=c;
    }
}
