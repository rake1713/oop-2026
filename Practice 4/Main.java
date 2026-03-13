public class Main {
    public static void main(String[] args) {
        Restaurant delPapa = new Restaurant(); 
        Cat a1 = new Cat(3, "Барсик", "Белый", "Шотландская вислоухая"); 
        Student s1 = new Student("Рома", 19, "Муж", 2, "Information System"); 

        
        System.out.println("____________________Тестируем Ресторан____________________");
        System.out.println("\nСегодня в меню пицца размером: " + CanHavePizza.PIZZASIZE);
        delPapa.servePizza(a1);
        System.out.println();
        delPapa.servePizza(s1); 



        System.out.println("\n____________________Тестируем способности Студента____________________");
        s1.move();
        s1.dance();
        s1.retakeExam(); 

        Movable a = s1; 
        a.move(); 
        CanHaveParty b=s1;
        b.move();
        b.dance();
        System.out.println("\n____________________Тестируем____________________");
        System.out.println(a1);
        System.out.println("\n"+s1);
    }
}