public class Restaurant{
    public boolean servePizza(CanHavePizza client){
        client.eatPizza();
        if (client instanceof Person) {
            System.out.println("Обработка платежа... Спасибо за покупку!"); 
        } else {
            System.out.println("Это животное, накормим бесплатно.");
        }
        return true;
    }
    
}
