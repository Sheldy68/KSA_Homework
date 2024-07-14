package Module5_KorotaevaSA.Middle;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Для каждого натурального числа в промежутке от N вывести все делители, кроме единицы и самого числа.
//        Значение N вводятся с клавиатуры. N может принимать значение от 1 до 100.
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите число от 1 до 100:");
        int number = scan.nextInt();
        String text = "Делители: ";
        //цикл по массиву
        for (int i = 2; i < number; i++) {
            //если делится без остатка:
            if (number % i == 0) {
                text = text + " " + i;
            }
        }
        if (number == 1) {
            System.out.println("Для числа 1 делитель только единица");
        } else if (number < 1 | number > 100) {
            System.out.println("Некорректный ввод числа");
        } else {
            System.out.println(text);
        }
        /*
        Результат:
        Укажите число от 1 до 100:
            75
            Делители:  3 5 15 25
         */
    }
}
