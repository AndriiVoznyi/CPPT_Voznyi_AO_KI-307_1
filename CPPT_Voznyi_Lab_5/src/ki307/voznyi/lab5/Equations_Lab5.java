package ki307.voznyi.lab5;

import java.io.*;

/**
 * Клас Equations_Lab5 для обчислення та запису результату функції cos(x)/sin(x) у текстовий та бінарний файл.
 */
public class Equations_Lab5 {
    private double x;
    private double x_rad;
    private PrintWriter fout;

    /**
     * Конструктор за замовчуванням, ініціалізує значення x та x_rad.
     */
    public Equations_Lab5() {
        this.x = 0;
        this.x_rad = 0;
    }

    /**
     * Конструктор з параметром, ініціалізує значення x та x_rad зазначеним значенням x у градусах.
     *
     * @param x Значення x у градусах.
     */
    public Equations_Lab5(double x) {
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
     * Метод для запису результату обчислення у текстовий та бінарний файл.
     *
     * @param out_file      Шлях до текстового файлу.
     * @param out_file_bin  Шлях до бінарного файлу.
     */
    public void in_files(String out_file, String out_file_bin) {
        try {
            fout = new PrintWriter(new BufferedWriter(new FileWriter(out_file)));
            fout.print("cos(x)/sin(x) = " + Calc() + "\n");
            fout.close();
            DataOutputStream fout_bin = new DataOutputStream(new FileOutputStream(out_file_bin));
            fout_bin.writeChars("cos(x)/sin(x) .bin file = " + Calc() + "\n");
            fout_bin.close();

        } catch (IOException e) {
            System.err.println("Can't use the file!\n");
        } catch (ArithmeticException ae) {
            System.out.print(ae.getMessage());
        }
    }

    /**
     * Метод для закриття текстового файлу після використання.
     */
    public void close_file() {
        fout.close();
    }
}
