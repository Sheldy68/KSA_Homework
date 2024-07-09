package Module5_KorotaevaSA.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов. Значение N вводится с клавиатуры.
        Числа Фибоначчи – это элементы числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …,
        в которой каждое последующее число равно сумме двух предыдущих.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество элементов в ряде чисел N:");
        int n = scan.nextInt();
        int x = 1; // начнем считать с единицы
        int y = 0;
        if (n <= 0 ) {
            System.out.println("Некорректный ввод числа");
        } else {
            int[] array;
            array = new int[n];
            if (n > 1) {
                array[1] = 1; //второй элемент единица
            } else {
                array[0] = 0; //начинаем с нуля
            }
            //цикл по массиву
            for (int i = 2; i < n; i++) {
                array[i] = x; //текущее число
                y = array[i - 1]; //предыдущее число
                x = x + y; //сдвигаем счетчик
            }
                System.out.println(Arrays.toString(array)); //вывести массив
        }
    }
}
