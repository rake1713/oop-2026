import java.util.Objects;

public class Person implements Identifiable, Authenticatable, Comparable<Person>, Cloneable {
    private String name;
    private String iin;
    private String password;

    public Person(String name, String iin, String password) {
        this.name = name;
        this.iin = iin;
        this.password = password;
    }

    @Override
    public String getSystemID() {
        return "IIN-" + iin;
    }

    @Override
    public boolean login(String password) {
        return this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println(name + " вылогинился из системы.");
    }

    @Override
    public int compareTo(Person other) {
        return this.iin.compareTo(other.iin); 
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}