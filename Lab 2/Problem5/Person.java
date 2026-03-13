package Problem5;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) { 
        this.pet = pet; 
    }
    public void removePet() { 
        this.pet = null; 
    }
    public boolean hasPet() { 
        return pet != null; 
    }
    public Animal getPet() { 
        return pet; 
    }
    public String getName() { 
        return name; 
    }

    public int getAge() {
        return age;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (this.hasPet()) {
            caretaker.assignPet(this.pet);
            if (caretaker.getPet() == this.pet) { 
                this.removePet();
            }
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            this.assignPet(caretaker.getPet());
            caretaker.removePet();
        }
    }

    @Override
    public String toString() {
        return name + " [" + getOccupation() + "], Pet: " + (hasPet() ? pet : "None");
    }
}