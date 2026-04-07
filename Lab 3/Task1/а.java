abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sleep() {
        System.out.println(name + " он спиттт... Zzz");
    }

    abstract void makeSound();
}

interface Swimmable{
    int TIME=120;
    void swim();
}

class Dog extends Animal implements Swimmable {
    Dog(String name, int age) {
        super(name, age); 
    }

    @Override
    void makeSound() { 
        System.out.println("Гав Гав Гав");
    }

    @Override
    public void swim() { 
        System.out.println(name + " плавает, гребя лапами, может плавать "+TIME+" секунд");
    }
}


class Submarine implements Swimmable {
    @Override
    public void swim() { 
        System.out.println("Подводная лодка погружается на большую глубину."); 
    }
}