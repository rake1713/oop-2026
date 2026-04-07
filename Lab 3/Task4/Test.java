import java.util.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Alibi", 500000, new Date(123, 0, 1), "INS001");
        Employee e2 = new Employee("Baurzhan", 450000, new Date(122, 5, 15), "INS002");
        Manager m1 = new Manager("Sanzhar", 700000, new Date(120, 10, 10), "MNG001", 50000);
        
        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, m1));

        Collections.sort(list);
        list.forEach(System.out::println);

        list.sort(new NameComparator());
        list.forEach(System.out::println);

        Employee e1Clone = (Employee) e1.clone();
        System.out.println("Оригинал: " + e1);
        System.out.println("Клон: " + e1Clone);
        System.out.println("e1 == e1Clone? " + (e1 == e1Clone)); 
        System.out.println("e1.equals(e1Clone)? " + e1.equals(e1Clone));
    }
}