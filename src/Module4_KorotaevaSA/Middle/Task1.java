package Module4_KorotaevaSA.Middle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*
        1. Определить, какое из трёх введённых пользователем значений наименьшее, наибольшее, среднее.

 */
        final int RANGE_3 = 3;
        final int RANGE_0 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int[] range = new int[RANGE_3];
        //запись вводимых значений с консоли в массив
        for (int i = RANGE_0; i < RANGE_3; i++) {
            range[i] = scanner.nextInt();
        }
        //поиск минимального значения в полученном массиве
        int min = range[RANGE_0];
        for (int i = RANGE_0; i < range.length; i++) {
            min = Math.min(min, range[i]);
        }
        //поиск максимального значения в полученном массиве
        int max = range[RANGE_0];
        for (int i = RANGE_0; i < range.length; i++) {
            max = Math.max(max, range[i]);
        }
        //поиск среднего значения
        int mid = 0;
        int x;   //промежуточная переменная
        int summ = 0; //промежуточная переменная для подсуммирования
        for (int i = RANGE_0; i < range.length; i++) {
            x = range[i];
            summ = summ + range[i];
            if (x > min & x < max) {
                mid = x;
            }
        }
        //общая сумма чисел
        if (mid == RANGE_0) {
            mid = summ - min - max;
        }

        if (mid == max  & mid == min) {
            System.out.println("Все значения равны");
        } else {
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            if ((mid == RANGE_0 & min > 0) | mid == min | mid == max ) {
                System.out.println("Mid не удалось определить");
            } else {
                System.out.println("Mid = " + mid);
            }
        }

        /* результат:
        Введите три числа:
        33
        23
        13
        Min = 13
        Max = 33
        Mid = 23

        Введите три числа:
        -1
        0
        0
        Min = -1
        Max = 0
        Mid не удалось определить

        Введите три числа:
        4
        4
        4
        Все значения равны
         */
        }
    }
