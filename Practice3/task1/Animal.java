package task1;

public class Animal {
    private String name;

    public Animal(String n){
        this.name=n;
    }

    public Animal(){
        this.name="Unnamed";
    }

    public String getName() {
        return name;
    }
    public void makeSound(){
        System.out.println("The " + this.name + " animal makes a sound.");
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return " name: "+this.name;
    }
}
