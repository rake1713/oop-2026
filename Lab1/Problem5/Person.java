package Problem5;

public class Person {
    enum Gender{
        BOY,GIRL;
    }
    private Gender gender;

    public Person(Gender g){
        this.gender=g;
    }
    public Gender getGender(){
        return gender;
    }
    public String toString(){
        return "\nGender"+gender;
    }
}
