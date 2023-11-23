import java.io.*;
import java.util.*;

/**
 * Ця програма виводить в консоль та у файл рисунок згідно до 4-го варіанту 
 *  
 * @author Voznyi Andrii CI-307
 * @version 1.0
 * @since version 1.0
 */
public class CPPT_Voznyi_Lab_1 {

    /**
     * Головний метод програми
     * @param args аргументи командного рядка
     * @throws FileNotFoundException якщо файл не знайдено
     */
    public static void main(String[] args) throws FileNotFoundException {

        String symbol;
        int N;
        char[][] matrix;
        int arr_cntr;
        PrintWriter fout = new PrintWriter("Lab1Voznyi.txt");

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть розмір матриці: ");
        N = input.nextInt();

        if (N < -1) {
            N *= -1;
        } else if (N == 0) {
            System.out.print("Некоректне значення розміру матриці");
            System.exit(0);
        }

        if (N % 2 == 0) {
            arr_cntr = 2;
        } else {
            arr_cntr = 1;
        }

        System.out.print("\nЗадайте символ заповнювач: ");
        input.nextLine();

        symbol = input.nextLine();

        if (symbol.length() > 1) {
            System.out.print("Ви ввели забагато символів");
            System.exit(0);
        }

        // Ініціалізуємо зубчастий масив потрібною кількістю рядків
        matrix = new char[N][];

        int tabs_cntr = N / 2;

        for (int i = 0; i < N; i++) {
            if (i >= N / 2) {
                for (int k = tabs_cntr; k > 0; k--) {
                    System.out.print("\t");
                    fout.write("\t");
                }

                matrix[i] = new char[arr_cntr];

                for (int j = 0; j < arr_cntr; j++) {
                    matrix[i][j] = symbol.charAt(0);
                    System.out.print(matrix[i][j] + "\t");
                    fout.write(matrix[i][j] + "\t");
                }
                arr_cntr += 2;
                tabs_cntr--;
            }
            System.out.println();
            fout.write("\n");
        }

        fout.close();
        input.close();
        System.out.close();
    }
}