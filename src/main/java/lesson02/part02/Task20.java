package lesson02.part02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Integer[] aNumbers = {
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())};

        Arrays.sort(aNumbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(aNumbers));

    }
}
