public class Animal {
    private int age;
     String name;

    public Animal(int a, String n){
        this.age=a;
        this.name=n;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name: "+name+"\nAge: "+age;
    }
}
