package ki307.voznyi.lab3;

interface Pet {
    void play();
}

interface Animal {
    void eat();
}

/**
 * Клас HouseCat представляє конкретний тип кота, який може бути домашнім улюбленцем та твариною.
 * Він розширює клас Cat та реалізує інтерфейси Pet та Animal.
 *
 * @author Ваше Ім'я
 * @version 1.0
 * @since версія 1.0
 */
public class HouseCat extends Cat implements Pet, Animal {
    private boolean isPurring;
    
    /**
     * Конструктор за замовчуванням для класу HouseCat.
     * Ініціалізує кота значеннями за замовчуванням і встановлює purring в true.
     */
    public HouseCat() {
        super();
        this.isPurring = true;
    }
    
    
    /**
     * Параметризований конструктор для класу HouseCat.
     *
     * @param name           Ім'я домашнього кота.
     * @param age            Вік домашнього кота.
     * @param catHealth      Інформація про здоров'я домашнього кота.
     * @param catAppearance  Інформація про зовнішній вигляд домашнього кота.
     * @param isPurring      Статус мурчання домашнього кота.
     */
    public HouseCat(String name, int age, CatHealth catHealth, CatAppearance catAppearance, boolean isPurring) {
        super(name, age, catHealth, catAppearance);
        this.isPurring = isPurring;
    }

    /**
     * Отримує статус мурчання домашнього кота.
     *
     * @return true, якщо кіт мурчить, false в іншому випадку.
     */
    public boolean isPurring() {
        return isPurring;
    }

    
    /**
     * Встановлює статус мурчання домашнього кота.
     *
     * @param isPurring true, якщо кіт мурчить, false в іншому випадку.
     */
    public void setPurring(boolean isPurring) {
        this.isPurring = isPurring;
    }

    
    /**
     * Реалізує поведінку гри для домашнього кота.
     * Якщо кіт мурчить, виводить, що кіт грає і мурчить.
     * В іншому випадку виводить, що кіт грає.
     */
    @Override
    public void play() {
        if (isPurring) {
            System.out.println("The cat is playing and purring.");
        } else {
            System.out.println("The cat is playing.");
        }
    }

    
    /**
     * Реалізує поведінку їжі для домашнього кота.
     * Виводить, що кіт їсть.
     */
    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }
    
    /**
     * Виводить інформацію про домашнього кота, включаючи його статус мурчання.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Purring: " + isPurring());
    }
}