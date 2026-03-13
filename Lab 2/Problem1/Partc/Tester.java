package Problem1.Partc;
import java.util.HashSet;

public class Tester {
    public static void main(String[] args) {
        HashSet<SmartLight> a=new HashSet<>();
        SmartLight lamp1=new SmartLight("Xiaomi Mi Bulb", true, 80);
        SmartLight lamp2=new SmartLight("Xiaomi Mi Bulb", true, 80);
        SmartLight lamp3=new SmartLight("Philips Hue", false, 0);

        a.add(lamp1);
        a.add(lamp2); 
        a.add(lamp3);
        System.out.println("Number of unique devices in HashSet: " + a.size());
        
        for (SmartLight light : a) {
            System.out.println(light);
        }
    }
}