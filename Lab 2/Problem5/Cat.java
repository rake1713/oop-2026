package Problem5;

public class Cat extends Animal {
    public Cat(String n, int a) { super(n, a); } 
    @Override
    public String getSound() { return "Meow!"; }
}

