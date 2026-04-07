public class Animal implements Identifiable, Cloneable {
    private String name;
    private String chipNumber;

    public Animal(String name, String chipNumber) {
        this.name = name;
        this.chipNumber = chipNumber;
    }

    @Override
    public String getSystemID() {
        return "CHIP-" + chipNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}