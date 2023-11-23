package ki307.voznyi.lab3;

/**
 * Головний клас для демонстрації функціоналу класів Cat та HouseCat.
 * Виводить інформацію про об'єкти кота та домашнього кота, а також викликає методи play та eat для домашнього кота.
 */
public class MainClass {
    /**
     * Точка входу в програму.
     * Створює об'єкти кота та домашнього кота, виводить їхню інформацію та викликає методи play та eat для домашнього кота.
     *
     * @param args Параметри командного рядка (не використовуються в даному випадку).
     */
    public static void main(String[] args) {
    	
    	// Створення об'єкта класу Cat за допомогою анонімного класу
        Cat cat = new Cat() {};

        System.out.println("Інформація про кота:");
        cat.displayInfo();
        System.out.println();

        // Створення об'єкта класу HouseCat з параметрами
        HouseCat houseCat = new HouseCat("Fluffy", 2, new CatHealth(true, true, 4, "Healthy"), new CatAppearance("Blue", "White"), true);

        System.out.println("Інформація про домашнього кота:");
        houseCat.displayInfo();

        // Виклик методів play та eat для домашнього кота
        houseCat.play();
        houseCat.eat();
    }
}
