public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Ақтөс", 3);

        myDog.sleep();     
        myDog.makeSound();  
        myDog.swim();       
        
        Submarine yellowSub = new Submarine();
        yellowSub.swim();

        Swimmable[] swimmers = new Swimmable[2];
        swimmers[0] = myDog;
        swimmers[1] = yellowSub;

        for (Swimmable s : swimmers) {
            s.swim(); 
        }
        System.out.println("\nМаксимальное время плавания: " + Swimmable.TIME + " сек.");
    }
}