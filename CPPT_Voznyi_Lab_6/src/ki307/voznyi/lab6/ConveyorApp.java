package ki307.voznyi.lab6;

/**
 * Додатковий клас для демонстрації використання класу Conveyor у програмі.
 */
public class ConveyorApp {
    public static void main(String[] args) {
        // Створення конвеєра для цілих чисел
        Conveyor<Integer> integerConveyor = new Conveyor<>();

        // Додавання елементів до конвеєра
        integerConveyor.addItem(10);
        integerConveyor.addItem(30);
        integerConveyor.addItem(20);

        // Парний варіант - пошук мінімального елементу
        System.out.println("Min Element: " + integerConveyor.processEven());

        // Виймання елементу з конвеєра
        System.out.println("Removed Element: " + integerConveyor.removeItem());

        // Створення конвеєра для рядків
        Conveyor<String> stringConveyor = new Conveyor<>();

        // Додавання елементів до конвеєра
        stringConveyor.addItem("Apple");
        stringConveyor.addItem("Banana");
        stringConveyor.addItem("Orange");

        // Парний варіант - пошук мінімального елементу
        System.out.println("Min Element: " + stringConveyor.processEven());

        // Виймання елементу з конвеєра
        System.out.println("Removed Element: " + stringConveyor.removeItem());
    }
}
