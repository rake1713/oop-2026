public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person("Ramazan", "040505500123", "admin123");
        Animal dog = new Animal("Aktos", "999888");

        System.out.println("Системная идентификация");
        System.out.println("ID Человека: " + p.getSystemID());
        System.out.println("ID Животного: " + dog.getSystemID());

        System.out.println("\nБезопасность");
        if (p.login("admin123")) {
            System.out.println("Доступ разрешен для " + p.getSystemID());
        } else {
            System.out.println("Ошибка пароля!");
        }

        System.out.println("\nКлонирование");
        Animal dogClone = (Animal) dog.clone();
        System.out.println("Клон собаки успешно создан. ID совпадает: " + dogClone.getSystemID());
    }
}