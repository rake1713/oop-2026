package Problem4;

public class Test {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(6.0);
        Circuit e = new Resistor(2.0);

        Circuit ser1 = new Parallel(a, b);
        Circuit ser2 = new Series(c, d);
        Circuit par = new Parallel(ser1, ser2); 
        Circuit circuit = new Series(par, e);  

        circuit.applyPotentialDiff(12.0); 

        System.out.println("Total Resistance: " + circuit.getResistance()); 
        System.out.println("Total Current: " + circuit.getCurrent());
        System.out.println("Total Power: " + circuit.getPower());
    }
}