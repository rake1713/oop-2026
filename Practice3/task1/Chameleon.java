package task1;

public class Chameleon extends Animal {
    private String color;
    
    public Chameleon(String n, String c){
        super(n);
        this.color=c;
    }

    public Chameleon(){
        super();
    }

    @Override
    public void makeSound(){
        System.out.println("Chameleon is silent, it just blinks");
    }

    public void changeColor(){
        System.out.println("The chameleon "+ getName() +" changed colour to its base (green) colour.");
    }

    public void changeColor(String c){
        this.color=c;
        System.out.println("The chameleon "+ getName() +" changed colour to "+this.color);
    }
    public void setChameleonName(String n){
        super.setName(n);
    }

    @Override
    public String toString(){
        return "Chameleon"+super.toString() + " with "+this.color+" color";
    }
}
