package Problem1.Partc;
import java.util.Objects;

public class SmartLight extends SmartDevice {
    private int brightness; 

    public SmartLight(String n, boolean o, int b) {
        super(n, o); 
        this.brightness = b;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        SmartLight that = (SmartLight) o;
        return brightness == that.brightness;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brightness);
    }

    @Override
    public String toString() {
        return super.toString() + ", Brightness: " + brightness + "%";
    }
}