package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран максимальное из четырёх чисел.
 * 4.	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

public class Task19 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int iNumber1 = Integer.parseInt(scanner.nextLine());
        int iNumber2 = Integer.parseInt(scanner.nextLine());
        int iNumber3 = Integer.parseInt(scanner.nextLine());
        int iNumber4 = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.max( Math.max(iNumber1, iNumber2), Math.max(iNumber3, iNumber4)));

    }
}
