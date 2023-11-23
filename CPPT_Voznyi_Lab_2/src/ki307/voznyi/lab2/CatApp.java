package ki307.voznyi.lab2;

/**
 * Ця програма виводить в консоль та у файл рисунок згідно до 4-го варіанту 
 *  
 * @author Voznyi Andrii CI-307
 * @version 1.0
 * @since version 1.0
 */

public class CatApp {
	 /**
     * Точка входу в програму. Створює об'єкти котів, відображає їхню інформацію та
     * виконує деякі зміни в інформації про котів.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        // Створення об'єкта кота за допомогою конструктора за замовчуванням
        Cat cat1 = new Cat();
        cat1.displayInfo();

        // Створення об'єкта кота з параметрами
        CatHealth health = new CatHealth(true, true, 4, "Healthy");
        CatAppearance appearance = new CatAppearance("Green", "Striped");
        Cat cat2 = new Cat("Whiskers", 4, health, appearance);
        cat2.displayInfo();

        // Зміна імені та віку кота
        cat2.changeName("Fluffy");
        cat2.changeAge(6);
        cat2.displayInfo();

        // Зміна здоров'я та зовнішнього вигляду кота
        cat2.updateHealth(true, false, 3, "Injured");
        cat2.updateAppearance("Blue", "Spotted");
        cat2.displayInfo();
    }
}