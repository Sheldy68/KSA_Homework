package Module5_KorotaevaSA.Middle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        В массиве, состоящем из N вещественных элементов найти максимальный по модулю элемент массива.
        N может принимать значение от 1 до 100. Пример:
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите число элементов в массиве от 1 до 100:");
        int numberOfElements = scan.nextInt();
        System.out.println("Введите эелементы массива по одному:");
        float[] array = new float[numberOfElements];
        //запись вводимых значений с консоли в массив
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextFloat();
        }
        //цикл по массиву
        float maxABS = array[0];
        float max = 0;
        for (int i = 0; i < array.length; i++) {
            maxABS = Math.max(maxABS, Math.abs(array[i]));
            if (Math.abs(array[i]) == maxABS) {
                max = array[i]; //число с учетом знака
            }
        }
        System.out.println("Максимальное по модулю значение у элемента: " + max);
        /* результат:
            Укажите число элементов в массиве от 1 до 100:
            5
            Введите эелементы массива по одному:
            -2,5 0 1 -5,1 4
            Максимальное по модулю значение у элемента: -5.1
         */
    }
}
