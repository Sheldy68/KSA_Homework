package Module5_KorotaevaSA.Middle;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Вычислить факториал числа, которое ввёл пользователь. Факториал числа представляет собой произведение всех
        натуральных чисел от 1 до этого числа включительно. Например, факториал числа 7 вычисляется так:
        1 * 2 * 3 * 4 * 5 * 6 * 7
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите натуральное число:");
        double n = scan.nextDouble();
        double x = 0;
        double res = 1;
        //цикл по массиву
        for (int i = 0; i < n; i++) {
            x = x + 1;
            //если делится без остатка:
            res = res * x;
        }
        if (n < 1 ) {
            System.out.println("Некорректный ввод числа");
        } else {
            System.out.println(res);
        }
        /*
        Результат:
        Укажите натуральное число:
            7
            5040
         */
    }
}
