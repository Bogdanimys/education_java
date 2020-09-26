package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 * <p>
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна содержать System.out.println() или System.out.print()
 * 3.	Если два числа равны между собой, необходимо вывести числа на экран.
 * 4.	Если все три числа равны между собой, необходимо вывести все три.
 * 5.	Если нет равных чисел, ничего не выводить.
 */

public class Task17 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int iNumber1 = Integer.parseInt(scanner.nextLine());
        int iNumber2 = Integer.parseInt(scanner.nextLine());
        int iNumber3 = Integer.parseInt(scanner.nextLine());

        if (iNumber1 == iNumber2 && iNumber3 != iNumber1) System.out.println(iNumber1 + " " + iNumber2);
        if (iNumber1 == iNumber3 && iNumber2 != iNumber1) System.out.println(iNumber1 + " " + iNumber3);
        if (iNumber2 == iNumber3 && iNumber1 != iNumber2) System.out.println(iNumber2 + " " + iNumber3);

        if (iNumber1 == iNumber2 && iNumber2 == iNumber3) System.out.println(iNumber1 + " " + iNumber2 + " " + iNumber3);

    }
}