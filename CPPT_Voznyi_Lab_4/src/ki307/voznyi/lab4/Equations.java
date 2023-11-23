package ki307.voznyi.lab4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Клас Equations для обчислення та запису результату функції cos(x)/sin(x) у файл.
 */
public class Equations {
    private double x;
    private double x_rad;
    private PrintWriter fout;

    /**
     * Конструктор за замовчуванням, ініціалізує значення x та x_rad.
     */
    public Equations() {
        this.x = 0;
        this.x_rad = 0;
    }

    /**
     * Конструктор з параметром, ініціалізує значення x та x_rad зазначеним значенням x у градусах.
     *
     * @param x Значення x у градусах.
     */
    public Equations(double x) {
        this.x = x;
        this.x_rad = x * 3.14159 / 180;
    }

    /**
     * Метод для обчислення виразу cos(x)/sin(x).
     *
     * @return Результат обчислення виразу cos(x)/sin(x).
     * @throws ArithmeticException Виняток, якщо sin(x) дорівнює 0.
     */
    public double Calc() throws ArithmeticException {
        if (Math.sin(x_rad) == 0) {
            throw new ArithmeticException("Exeption: sin(x) is equal to 0!\n");
        } else {
            return Math.cos(x_rad) / Math.sin(x_rad);
        }
    }

    /**
     * Метод для запису результату обчислення у файл "Lab4.txt".
     */
    public void in_file() {
        try {
            fout = new PrintWriter(new BufferedWriter(new FileWriter("Lab4.txt")));
            fout.print("cos(x)/sin(x) = " + Calc() + "\n");

        } catch (IOException | ArithmeticException e) {
            System.err.println("Can't use the file!!!\n");
        }
    }

    /**
     * Метод для закриття файлу після використання.
     */
    public void close_file() {
        fout.close();
    }
}
