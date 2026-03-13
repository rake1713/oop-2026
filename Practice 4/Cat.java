public class Cat extends Animal implements CanHavePizza{
    private String color;
    private String breed;

    public Cat(int a, String n, String c, String b){
        super(a, n);
        this.color=c;
        this.breed=b;
    }
    @Override
    public void eatPizza(){
        System.out.println("Кот "+super.getName()+" ест пиццу");
    }
    public String getColor() {
        return color;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return super.toString()+"\nColor: "+color+"\nBreed: "+breed;
    }
}
