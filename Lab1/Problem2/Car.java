package Problem2;

public class Car {
    enum  CarBody {
        SEDAN,WAGON,HATCHBACK,CABRIOLET;
    }
    private final int CAR_YEAR;
    static int car_count = 0;   
    private String model;
    private CarBody type;
    private int price;

    {
        ++car_count;
        System.out.println("Машина был добавлен в базу");
    }
    
    public Car(int year, String mod, CarBody kuzov, int price){
        this.CAR_YEAR=year;
        this.model=mod;
        this.type=kuzov;
        this.price=price;
    }
    public Car(int year, String mod){
        this(year, mod, CarBody.SEDAN, 0);
    }
    public void startEngine(){
        System.out.println("Двигатель запущен от физического ключа автомобиля");
    }
    public void startEngine(boolean auto_zapusk){
        if (auto_zapusk) {
            System.out.println("Двигатель успешно запущен дистанционно");
        }
        else {
            System.out.println("Двигатель не запустился дистанционно по непонятным причинам");
        }
    }
    public int getCarYear(){
        return CAR_YEAR;
    }
    public int getCarPrice(){
        return price;
    }
    public void getCarINFO(){
        System.out.println("Car Year: " + CAR_YEAR);
        System.out.println("Car Model: " + model);
        System.out.println("Car Body type: " + type);
        System.out.println("Car Price: " + price+"$");
    }
}
