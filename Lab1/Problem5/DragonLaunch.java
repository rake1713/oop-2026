package Problem5;
import java.util.Vector;
//made by Rake1713
import Problem5.Person.Gender;

public class DragonLaunch {
    Vector<Person> launch_persons;
    public DragonLaunch(){
        launch_persons=new Vector<Person>();
    }
    public void kidnap(Person p){
        launch_persons.add(p);
    }
    
    public boolean willDragonEatOrNot(){
        int boysToMatch = 0;
        for(Person p:launch_persons){
            if (p.getGender() == Gender.BOY) {
                boysToMatch++;
            } else {
                if (boysToMatch > 0) {
                    boysToMatch--;
                } else {
                    return true; 
                }
            }
        }
        return boysToMatch > 0;
    }
    public String getline(){
        String line = "";
        for (Person p:launch_persons){
            if (p.getGender() == Gender.BOY)
                line+="B";
            else{
                if (p.getGender() == Gender.GIRL)
                    line+="G";
            }
        }
        return line;
    }


    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();
        Person p = new Person(Gender.BOY);
        DragonLaunch launchh = new DragonLaunch();
        launch.kidnap(p);
        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.GIRL));
        System.out.println("Line "+launch.getline() + " Will dragon eat? " + launch.willDragonEatOrNot());


        launchh.kidnap(new Person(Gender.GIRL));
        launchh.kidnap(new Person(Gender.BOY));
        launchh.kidnap(new Person(Gender.GIRL));
        launchh.kidnap(new Person(Gender.BOY));
        System.out.println("Line "+launchh.getline() + " Will dragon eat? " + launchh.willDragonEatOrNot());
    }

}
