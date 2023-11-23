package ki307.voznyi.lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас, що представляє інформацію про здоров'я кота.
 */
class CatHealth {

    /**
     * Значення, яке показує, чи є у кота зір.
     */
    private boolean vision;

    /**
     * Значення, яке показує, чи є у кота слух.
     */
    private boolean hearing;

    /**
     * Кількість лап у кота.
     */
    private int numberOfPaws;

    /**
     * Стан здоров'я кота.
     */
    private String wellBeing;

    /**
     * Конструктор за замовчуванням. Створює об'єкт із заданими значеннями за замовчуванням.
     */
    public CatHealth() {
        this.vision = true;
        this.hearing = true;
        this.numberOfPaws = 4;
        this.wellBeing = "Healthy";
    }

    /**
     * Конструктор, який дозволяє встановити значення параметрів.
     *
     * @param vision     Наявність зіру у кота.
     * @param hearing    Наявність слуху у кота.
     * @param numOfPaws  Кількість лап у кота.
     * @param wellBeing  Стан здоров'я кота.
     */
    public CatHealth(boolean vision, boolean hearing, int numOfPaws, String wellBeing) {
        this.vision = vision;
        this.hearing = hearing;
        this.numberOfPaws = numOfPaws;
        this.wellBeing = wellBeing;
    }

    /**
     * Метод для перевірки наявності зіру у кота.
     *
     * @return Значення true, якщо у кота є зір, в іншому випадку - false.
     */
    public boolean hasVision() {
        return vision;
    }

    /**
     * Метод для перевірки наявності слуху у кота.
     *
     * @return Значення true, якщо у кота є слух, в іншому випадку - false.
     */
    public boolean hasHearing() {
        return hearing;
    }

    /**
     * Метод для отримання кількості лап у кота.
     *
     * @return Кількість лап у кота.
     */
    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    /**
     * Метод для отримання стану здоров'я кота.
     *
     * @return Стан здоров'я кота.
     */
    public String getWellBeing() {
        return wellBeing;
    }

    /**
     * Метод для оновлення інформації про здоров'я кота.
     *
     * @param vision     Наявність зіру у кота.
     * @param hearing    Наявність слуху у кота.
     * @param numOfPaws  Кількість лап у кота.
     * @param wellBeing  Стан здоров'я кота.
     */
    public void updateHealth(boolean vision, boolean hearing, int numOfPaws, String wellBeing) {
        this.vision = vision;
        this.hearing = hearing;
        this.numberOfPaws = numOfPaws;
        this.wellBeing = wellBeing;
        logActivity("Updated health information.");
    }

    /**
     * Метод для виведення інформації про здоров'я кота на консоль.
     */
    public void displayHealthInfo() {
        System.out.println("Vision: " + hasVision());
        System.out.println("Hearing: " + hasHearing());
        System.out.println("Number of Paws: " + getNumberOfPaws());
        System.out.println("Well-being: " + getWellBeing());
    }

    /**
     * Приватний метод для записування діяльності у файл журналу.
     *
     * @param activity Діяльність для запису.
     */
    private void logActivity(String activity) {
        // реалізація методу logActivity
    }
}


/**
 * Клас, що представляє зовнішній вигляд кота, такий як колір очей та окрас шерсті.
 */
class CatAppearance {

    /**
     * Колір очей кота.
     */
    private String eyeColor;

    /**
     * Окрас шерсті кота.
     */
    private String coatColor;

    /**
     * Конструктор за замовчуванням. Створює об'єкт із заданими значеннями за замовчуванням.
     */
    public CatAppearance() {
        this.eyeColor = "Unknown";
        this.coatColor = "Unknown";
    }

    /**
     * Конструктор, який дозволяє встановити значення параметрів.
     *
     * @param eyeColor   Колір очей кота.
     * @param coatColor  Окрас шерсті кота.
     */
    public CatAppearance(String eyeColor, String coatColor) {
        this.eyeColor = eyeColor;
        this.coatColor = coatColor;
    }

    /**
     * Метод для отримання коліра очей кота.
     *
     * @return Колір очей кота.
     */
    public String getEyeColor() {
        logActivity("Checked eye color.");
        return eyeColor;
    }

    /**
     * Метод для отримання окрасу шерсті кота.
     *
     * @return Окрас шерсті кота.
     */
    public String getCoatColor() {
        logActivity("Checked coat color.");
        return coatColor;
    }

    /**
     * Метод для оновлення інформації про зовнішній вигляд кота.
     *
     * @param newEyeColor   Новий колір очей кота.
     * @param newCoatColor  Новий окрас шерсті кота.
     */
    public void updateAppearance(String newEyeColor, String newCoatColor) {
        this.eyeColor = newEyeColor;
        this.coatColor = newCoatColor;
        logActivity("Updated appearance information.");
    }

    /**
     * Метод для відображення інформації про зовнішній вигляд кота на консоль.
     */
    public void displayAppearanceInfo() {
        System.out.println("Eye Color: " + getEyeColor());
        System.out.println("Coat Color: " + getCoatColor());
    }

    /**
     * Приватний метод для записування діяльності у файл журналу.
     *
     * @param activity Діяльність для запису.
     */
    private void logActivity(String activity) {
        // реалізація методу logActivity
    }
}


/**
 * Клас, що представляє кота з визначеним ім'ям, віком, здоров'ям та зовнішнім виглядом.
 */
public class Cat {

    /**
     * Ім'я кота.
     */
    private String name;

    /**
     * Вік кота.
     */
    private int age;

    /**
     * Об'єкт, що представляє здоров'я кота.
     */
    private CatHealth catHealth;

    /**
     * Об'єкт, що представляє зовнішній вигляд кота.
     */
    private CatAppearance catAppearance;

    /**
     * Конструктор за замовчуванням. Створює кота з ім'ям "Unknown", віком 0, здоров'ям і зовнішнім виглядом за замовчуванням.
     */
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
        this.catHealth = new CatHealth();
        this.catAppearance = new CatAppearance();
    }

    /**
     * Конструктор, який встановлює тільки вік кота.
     *
     * @param age Вік кота.
     */
    public Cat(int age) {
        this.age = age;
    }

    /**
     * Конструктор з параметрами.
     *
     * @param name        Ім'я кота.
     * @param age         Вік кота.
     * @param catHealth   Здоров'я кота.
     * @param catAppearance Зовнішній вигляд кота.
     */
    public Cat(String name, int age, CatHealth catHealth, CatAppearance catAppearance) {
        this.name = name;
        this.age = age;
        this.catHealth = catHealth;
        this.catAppearance = catAppearance;
    }

    /**
     * Метод для зміни імені кота.
     *
     * @param newName Нове ім'я кота.
     */
    public void changeName(String newName) {
        this.name = newName;
        logActivity("Name changed to " + newName);
    }

    /**
     * Метод для виведення інформації про всіх котів віком 5 років у файл.
     */
    public void CatList() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("catList.log", true))) {
            writer.write(this.name + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для зміни віку кота.
     *
     * @param newAge Новий вік кота.
     */
    public void changeAge(int newAge) {
        this.age = newAge;
        logActivity("Age changed to " + newAge);
    }

    /**
     * Метод для виведення інформації про кота на консоль.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        catAppearance.displayAppearanceInfo();
        catHealth.displayHealthInfo();
    }

    /**
     * Приватний метод для запису діяльності в файл журналу.
     *
     * @param activity Діяльність для запису.
     */
    private void logActivity(String activity) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cat_activity.log", true))) {
            writer.write(activity + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, що повертає ім'я кота.
     *
     * @return Ім'я кота.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для встановлення нового імені кота.
     *
     * @param name Нове ім'я кота.
     */
    public void setName(String name) {
        this.name = name;
        logActivity("Name changed to " + name);
    }

    /**
     * Метод, що повертає вік кота.
     *
     * @return Вік кота.
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для встановлення нового віку кота.
     *
     * @param age Новий вік кота.
     */
    public void setAge(int age) {
        this.age = age;
        logActivity("Age changed to " + age);
    }

    /**
     * Метод для оновлення інформації про здоров'я кота.
     *
     * @param vision     Наявність зіру у кота.
     * @param hearing    Наявність слуху у кота.
     * @param numOfPaws  Кількість лап у кота.
     * @param wellBeing  Стан здоров'я кота.
     */
    public void updateHealth(boolean vision, boolean hearing, int numOfPaws, String wellBeing) {
        catHealth.updateHealth(vision, hearing, numOfPaws, wellBeing);
        logActivity("Updated health information.");
    }

    /**
     * Метод для оновлення інформації про зовнішній вигляд кота.
     *
     * @param eyeColor   Новий колір очей кота.
     * @param coatColor  Новий окрас шерсті кота.
     */
    public void updateAppearance(String eyeColor, String coatColor) {
        catAppearance.updateAppearance(eyeColor, coatColor);
        logActivity("Updated appearance information.");
    }

    /**
     * Метод для виведення інформації про здоров'я кота на консоль.
     */
    public void displayHealthInfo() {
        catHealth.displayHealthInfo();
    }

    /**
     * Метод для виведення інформації про зовнішній вигляд кота на консоль.
     */
    public void displayAppearanceInfo() {
        catAppearance.displayAppearanceInfo();
    }

}