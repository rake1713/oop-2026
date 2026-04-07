import java.util.Date;

public class TestSort {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Сортировка Шоколада (по весу) ===");
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.5),
            new Chocolate("Snickers", 60.0),
            new Chocolate("Mars", 45.0)
        };
        Sort.mergeSort(chocolates); 
        for (Chocolate c : chocolates) System.out.println(c);

        System.out.println("\n=== 2. Сортировка Времени (хронологически) ===");
        Time[] times = {
            new Time(23, 10, 0),
            new Time(12, 0, 0),
            new Time(05, 30, 0)
        };
        Sort.bubbleSort(times);
        for (Time t : times) System.out.println(t);
    }
}