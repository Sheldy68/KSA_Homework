package Module5_KorotaevaSA.Easy;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Допишите программу, которая возводит число в целочисленную степень. Число и степень вводятся с клавиатуры.
        Использовать цикл для возведения в степень.
         */
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println("Результат: ");
        int i = 1; //счетчик
        int result = 1;
//        do {
//            result = result * number;
//            i++;
//        } while (i <= power);
        //цикл do while наименее предпочтителен

        while (i <= power) {
            result = result * number;
            i++;
        }
//     или  можно так
//        for (int i = 1; i <= power; i++) {
//            result = result * number;
//        }

        System.out.println(result);
    }
}
