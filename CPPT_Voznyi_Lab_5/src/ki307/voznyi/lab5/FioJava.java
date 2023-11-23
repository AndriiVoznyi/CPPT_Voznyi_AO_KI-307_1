package ki307.voznyi.lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Клас FioJava для введення та виведення значень та обчислення виразу.
 */
public class FioJava {

    /**
     * Основний метод програми.
     *
     * @param args Аргументи командного рядка.
     * @throws IOException Виняток, який може виникнути при роботі з файлами.
     */
    public static void main(String[] args) throws IOException {
        double x;
        double res;
        File file = new File("Lab5_Voznyi.txt");
        File file_bin = new File("Lab5_Voznyi_binary.bin");

        Scanner input = new Scanner(System.in);
        System.out.print("Input X: ");

        x = input.nextDouble();

        Equations_Lab5 eq = new Equations_Lab5(x);

        res = eq.Calc();

        System.out.print("cos(x)/sin(x) = " + res + "\n\n");

        FileIO_Class fio = new FileIO_Class(file, file_bin);

        fio.inFile(res);
        fio.outFile();

        input.close();
    }
}
