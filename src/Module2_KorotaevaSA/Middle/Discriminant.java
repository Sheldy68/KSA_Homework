package Module2_KorotaevaSA.Middle;

import java.util.Scanner;

public class Discriminant {
    /*
    Посчитать дискриминант квадратного уравнения. Дискриминант рассчитывается по формуле D=b^2-4ac.
    Пользователем вводятся значения a, b и c. Нужно вывести дискриминант уравнения.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        double a = scanner.nextDouble();
        System.out.println("Введите число b:");
        double b = scanner.nextDouble();
        System.out.println("Введите число c:");
        double c = scanner.nextDouble();
        System.out.printf("Введены числа: a = %f, b = %f, c = %f", a, b, c);
        double d = Math.pow(b,2) - 4 * a * c;
        System.out.println("\nДискриминант d = " + d);
        /* результат
        Введите число a:
        12,34
        Введите число b:
        34,23
        Введите число c:
        234,55
        Введены числа: a = 12,340000, b = 34,230000, c = 234,550000
        Дискриминант d = -10405.6951
        */
    }
}
