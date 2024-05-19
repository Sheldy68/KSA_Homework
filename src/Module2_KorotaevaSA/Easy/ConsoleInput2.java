package Module2_KorotaevaSA.Easy;

import java.util.Scanner;

public class ConsoleInput2 {
    /*
Считать с консоли три вещественных числа, вывести их сумму и произведение.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        double a = scanner.nextDouble();
        System.out.println("Введите число b:");
        double b = scanner.nextDouble();
        System.out.println("Введите число c:");
        double c = scanner.nextDouble();

        System.out.printf("Введены числа: a = %f, b = %f и c = %f", a, b, c);
        double summ = a + b + c;
        double multpl = a * b * c;
        System.out.printf("\nСумма чисел: %f, произведение: %f", summ, multpl);
        /* результат
        Введите число a:
        32323,33
        Введите число b:
        2213213,444
        Введите число c:
        23231333344,567
        Введены числа: a = 32323,330000, b = 2213213,444000 и c = 23231333344,567000
        Сумма чисел: 23233578881,341000, произведение: 1661933079681998000000,000000
         */
    }
}
