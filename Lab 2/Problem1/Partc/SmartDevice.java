package Problem1.Partc;
import java.util.Objects;

public class SmartDevice {
    private String modelName;
    private boolean isOn;

    public SmartDevice(String n, boolean o) {
        this.modelName=n;
        this.isOn=o;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDevice that = (SmartDevice) o;
        return isOn == that.isOn && Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, isOn); 
       }

    @Override
    public String toString() {
        return "Device: " + modelName + " (Status: " + (isOn ? "ON" : "OFF") + ")";
    }
}