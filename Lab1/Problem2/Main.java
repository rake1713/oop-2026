package Problem2;
import java.util.Scanner;
import Problem2.Car.CarBody;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Car c1 = new Car(s.nextInt(),s.next());
        c1.getCarINFO();
        System.out.println(c1.getCarPrice());
        System.out.println(c1.getCarYear());
        c1.startEngine();
        c1.startEngine(true);
        System.out.println("Count car: "+ Car.car_count);


        System.out.print("Напиши кузов (Sedan,Wagon,Hatchback,Cabriolet)");
        Car.CarBody userBody = null; 
        try {
            System.out.println("Введите кузов (SEDAN, WAGON, HATCHBACK, CABRIOLET):");
            String body = s.next(); 
            userBody = Car.CarBody.valueOf(body.toUpperCase());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Ошибка! Такого кузова не существует. По умолчанию ставим SEDAN.");
            userBody = Car.CarBody.SEDAN;
        }
        Car c2 = new Car(s.nextInt(),s.next(), userBody,s.nextInt());
         c2.getCarINFO();
        System.out.println(c2.getCarPrice());
        System.out.println(c2.getCarYear());
        c2.startEngine();
        c2.startEngine(true);
        System.out.println("Count car: "+ Car.car_count);   
    }
}