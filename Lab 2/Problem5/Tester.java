package Problem5;

public class Tester {
    public static void main(String[] args) {
        Person john = new Employee("Rom", 30, "Engineer");
        Person alice = new PhDStudent("Beksh", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);
        
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Before vacation:\n" + registry);

        john.leavePetWith(alice);
        System.out.println("During vacation:\n" + registry);

        john.retrievePetFrom(alice);
        System.out.println("After vacation:\n" + registry);
    }
}