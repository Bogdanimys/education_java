package lesson02.part02;

import java.util.Scanner;

/**
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 * <p>
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 * while (true) {
 * int number = считываем число;
 * if (проверяем, что number -1)
 * break;
 * }
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * 3.	Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * 4.	В программе должен использоваться цикл for, while или do-while.
 */

public class Task42 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int iNumber = 0;
        int iAns = 0;

        while (iNumber != -1){
            iAns += iNumber;

            iNumber = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(iAns);
    }
}
