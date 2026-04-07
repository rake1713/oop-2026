public class Test {
    public static void main(String[] args) {
        MyCollection<String> names = new MyArrayList<>();
        names.add("Ramazan");
        names.add("Java");
        
        System.out.println("Размер: " + names.size()); 
        System.out.println("Есть 'Java'? " + names.contains("Java")); 
        
        names.clear();
        System.out.println("Пусто? " + names.isEmpty()); 
    }
}