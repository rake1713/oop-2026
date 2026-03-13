package Problem5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() { 
        return name; 
    }
    public abstract String getSound();

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Sound: " + getSound() + ")";
    }
}