package Module5_KorotaevaSA.Middle;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Написать программу для проверки знания таблицы умножения. Для этого необходимо сгенерировать числа А и В при
        помощи new Random().nextInt()
        Затем перемножить их и сохранить в переменную С. Далее выведите на экран вопрос: “Сколько будет A * B?”.
        Пользователь вводит ответ. Необходимо считать ответ пользователя и проверить, правильно ли он ответил.
        Выведите 5 примеров из таблицы умножения.
         */
        int i = 0;
        do {
        i = i + 1;
        //чтобы не брать 0 и диапазон был от 1 до 9:
        int x = new Random().nextInt(9) + 1;
        int y = new Random().nextInt(9) + 1;
        int res = x * y;
        System.out.printf("\nСколько будет %d * %d?", x, y);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == res) {
            System.out.printf("\nОтвет верный");
        } else {
            System.out.printf("\nОтвет неверный. %d * %d = %d", x, y, res);
        }
        } while (i < 5);
    }
}