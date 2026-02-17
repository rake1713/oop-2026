package task2;

public class Person {
    private String name;
    private String address;

    public Person(String n, String a){
        this.name=n;
        this.address=a;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address=a;
    }

    @Override
    public String toString(){
        return "Person [name = "+this.name+", address= "+this.address+" ]";
    }
}
