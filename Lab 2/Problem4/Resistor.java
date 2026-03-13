package Problem4;

public class Resistor extends Circuit {
    private double resistance;
    private double v;

    public Resistor(double r) {
        this.resistance = r;
    }

    @Override
    public double getResistance() { 
        return resistance; 
    }

    @Override
    public double getPotentialDiff() { 
        return v; 

    }

    @Override
    public void applyPotentialDiff(double V) { 
        this.v = V; 
    }
}