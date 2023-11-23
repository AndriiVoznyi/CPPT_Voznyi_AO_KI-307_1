package ki307.voznyi.lab4;

import java.util.Scanner;

/**
 * Головний клас EquationsApp для введення значення x, обчислення та виведення результату функції cos(x)/sin(x) та запису його у файл "Lab4.txt".
 */
public class EquationsApp {

    /**
     * Точка входу в програму.
     * Вводить значення x, створює об'єкт класу Equations, обчислює та виводить результат функції cos(x)/sin(x) та записує його у файл "Lab4.txt".
     *
     * @param args Параметри командного рядка (не використовуються в даному випадку).
     */
    public static void main(String[] args) {

        double x = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input X: ");

        x = input.nextDouble();

        Equations eq = new Equations(x);

        System.out.print("cos(x)/sin(x) = " + eq.Calc() + "\n");

        eq.in_file();
        eq.close_file();
        input.close();

    }

}
