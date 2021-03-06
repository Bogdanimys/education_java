package lesson02.part02;

/**
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 * Пример для чисел 4 6 6:
 * 1
 * Пример для чисел 6 6 3:
 * 3
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна использовать команды System.out.println() или System.out.print().
 * 3.	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * 4.	Если все числа разные, ничего не выводить.
 */

import java.io.*;
import java.util.*;

public class Task24 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int iNumber1 = Integer.parseInt(scanner.nextLine());
        int iNumber2 = Integer.parseInt(scanner.nextLine());
        int iNumber3 = Integer.parseInt(scanner.nextLine());

        if (iNumber1 != iNumber2 && iNumber1 != iNumber3) System.out.println(iNumber1);
        if (iNumber2 != iNumber1 && iNumber2 != iNumber3) System.out.println(iNumber2);
        if (iNumber3 != iNumber2 && iNumber3 != iNumber1) System.out.println(iNumber3);

    }
}
