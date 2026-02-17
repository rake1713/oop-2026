package task1;

public class Main {
    public static void main(String[] args) {
        Chameleon ch1 = new Chameleon();
        ch1.makeSound();
        ch1.setChameleonName("RAke");
        ch1.makeSound();
        ch1.changeColor();
        ch1.changeColor("brown");
        System.out.println(ch1);
    }
}
