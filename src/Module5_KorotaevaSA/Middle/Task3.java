package Module5_KorotaevaSA.Middle;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Для каждого натурального числа в промежутке от N вывести все делители, кроме единицы и самого числа.
//        Значение N вводятся с клавиатуры. N может принимать значение от 1 до 100.
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите число от 1 до 100:");
        int n = scan.nextInt();
        int x = 0;
        String t = "Делители: ";
        //цикл по массиву
        for (int i = 0; i < n; i++) {
            x = x + 1;
            if (x == 1 | x == n) {
                // не учитываем
            } else {
                //если делится без остатка:
                if (n % x == 0) {
                    t = t + " " + x;
                }
            }
        }
        if (n == 1) {
            System.out.println("Для числа 1 делитель только единица");
        } else if (n < 1 | n > 100) {
            System.out.println("Некорректный ввод числа");
        } else {
            System.out.println(t);
        }
        /*
        Результат:
        Укажите число от 1 до 100:
            75
            Делители:  3 5 15 25
         */
    }
}
