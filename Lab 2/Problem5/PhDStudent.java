package Problem5;

public class PhDStudent extends Student {
    private String researchField;

    public PhDStudent(String name, int age, String major, String researchField) {
        super(name, age, major);
        this.researchField = researchField;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD Students are NOT allowed to have dogs!");
        } else {
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() { return "PhD Student (" + researchField + ")"; }
}