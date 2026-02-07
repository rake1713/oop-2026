package Problem4;


public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String n, String d, int c, String pre){
        this.name=n;
        this.description=d;
        this.credits=c;
        this.prerequisite=pre;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setDescription(String d){
        this.description=d;
    }
    public void setCredits(int c){
        this.credits=c;
    }
    public void setPrerequisite(String pre) {
        this.prerequisite = pre;
    }
    public String getName(){
        return name;
    }
    public int getCredits() {
        return credits;
    }
    public String getDescription() {
        return description;
    }
    public String getPrerequisite() {
        return prerequisite;
    }
    public String toString(){
        return "Object: "+name+"\nDescription: "+description+"\nCredits: "+credits+"\nPrerequisite: "+prerequisite;
    }
    
}
