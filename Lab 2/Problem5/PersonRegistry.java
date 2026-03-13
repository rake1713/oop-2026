package Problem5;
import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }
    public void removePerson(Person p) { people.remove(p); }

    @Override
    public String toString() {
        String result = "--- Registry ---\n";
        for (Person p : people) result += p + "\n";
        return result;
    }
}