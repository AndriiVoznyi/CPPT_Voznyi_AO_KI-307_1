package ki307.voznyi.lab5;

import java.io.*;

/**
 * Клас FileIO_Class для введення та виведення значень до текстового та бінарного файлів.
 */
public class FileIO_Class {

    private File file;
    private File file_bin;

    /**
     * Конструктор класу, ініціалізує шляхи до текстового та бінарного файлів.
     *
     * @param file     Шлях до текстового файлу.
     * @param file_bin Шлях до бінарного файлу.
     */
    FileIO_Class(File file, File file_bin) {
        this.file = file;
        this.file_bin = file_bin;
    }

    /**
     * Метод для введення значення у текстовий та бінарний файл.
     *
     * @param x Значення для введення.
     */
    public void inFile(double x) {
        PrintWriter fin = null;
        DataOutputStream fin_bin = null;
        try {
            fin = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            fin_bin = new DataOutputStream(new FileOutputStream(file_bin));

            fin.println(x);
            fin.close();
            fin_bin.writeDouble(x);
            fin_bin.close();
        } catch (IOException e) {
            System.err.println("Can't open the file!" + e);
        }
    }

    /**
     * Метод для виведення значень з текстового та бінарного файлів.
     */
    public void outFile() {
        BufferedReader fout = null;
        DataInputStream fout_bin = null;
        try {
            fout = new BufferedReader(new FileReader(file));
            fout_bin = new DataInputStream(new FileInputStream(file_bin));
            System.out.println("Result of reading file: \n" + fout.readLine() + "\n");
            fout.close();
            System.out.println("Result of reading .bin file: \n" + fout_bin.readDouble() + "\n");
            fout_bin.close();

        } catch (IOException e) {
            System.err.println("Error:" + e);
        }
    }
}
