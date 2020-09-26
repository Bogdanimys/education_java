package lesson02.part02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */

public class Task41 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] iArray = new int[3];
        iArray[0] = Integer.parseInt(scanner.nextLine());
        iArray[1] = Integer.parseInt(scanner.nextLine());
        iArray[2] = Integer.parseInt(scanner.nextLine());

        Arrays.sort(iArray);

        System.out.println(iArray[1]);


    }
}
