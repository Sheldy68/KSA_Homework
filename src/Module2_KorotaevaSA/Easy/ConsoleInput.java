package Module2_KorotaevaSA.Easy;

import java.util.Scanner;

public class ConsoleInput {
    /*
    Считать с консоли два числа (int) в переменные a и b, обменять значения переменных и вывести на экран.
    Например, если с консоли вводятся значения a=2 а b=5, то нужно поменять значения переменных местами: a=5, b=2.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.printf("Введены числа: a = %d и b = %d", a, b);
        int c = b;//промежуточная переменная, сохраним значение а
        //меняем местами
        b = a;
        a = c;
        System.out.printf("\nПоменяем местами: a = %d и b = %d", a, b);
    }
}
