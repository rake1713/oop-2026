public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String n, int a, String g){
        this.name=n;
        this.age=a;
        this.gender=g;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender;
    }
}
