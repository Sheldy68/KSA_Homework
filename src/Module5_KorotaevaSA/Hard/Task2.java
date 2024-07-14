package Module5_KorotaevaSA.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*
    Создать программу, которая из заданного массива будет удалять все повторяющиеся элементы (порядок не важен).
    С консоли вводится в первой строке длина массива, а во второй строке — элементы массива. Длина массива не более
    1000 элементов, значение каждого элемента массива положительно и не превышает 1000.
    Самое простое решение этой задачи — это завести массив длиной в 1000 элементов. Далее при считывании элемента
    массива использовать это число как индекс для обращения к массиву и по этому индексу устанавливать значение 1.
    После считывания всех элементов у нас получится массив с нулями и единицами. Дальше необходимо пройтись по массиву
    и выводить индексы элементов, значение которых равно 1.
     */
    public static void main(String[] args) {
        //массив для индексов
        int[] array1000;
        array1000 = new int[1000];
        int elementValue = 0; //для индекса
        int finalArrayLength = 0; //для массива
        int finalArrayIndex = 0; //для индекса
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество элементов в массиве (не более 1000):");
        int numberOfElememts = scan.nextInt();
        System.out.println("Перечислите элементы массива через пробел:");
//        String line = scan2.nextLine();
//        String[] elem = line.split(" "); //разбили по пробелу строку в массив
//        for( String arr : elem) {
//            System.out.println(arr); //вывести массив по элементам
//        }
        int[] elementsArray = new int[numberOfElememts];
        // считаем с консоли, можно с одной строки через пробел
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = scan.nextInt();
        }
        //цикл по массиву
        for (int i = 0; i < numberOfElememts; i++) {
        //    y = Integer.parseInt(elem[i]); //прочитаем значение i элемента
            elementValue = elementsArray[i];
            array1000[elementValue] = 1; //запишем число 1 с таким индексом в проверочный массив
            finalArrayLength = finalArrayLength + 1; //это будет длина массива с индексами
        }
        int[] arrayFinal;
        arrayFinal = new int[finalArrayLength];
        finalArrayLength = 0; //обнулим, чтобы дальше пересчитать
        for (int i = 0; i < array1000.length; i++) {
            elementValue = array1000[i]; //прочитаем значение i элемента
            if (elementValue == 1) {
                finalArrayLength = finalArrayLength + 1; // длина массива для печати, элементы только с единицами
                arrayFinal[finalArrayIndex] = i;
                finalArrayIndex = finalArrayIndex + 1;
            }
        }
        int[] arrayPrint;
        arrayPrint = new int[finalArrayLength];
        for (int i = 0; i < finalArrayLength; i++) {
            arrayPrint[i] = arrayFinal[i];
        }
        if (numberOfElememts > 0) {
            System.out.println(Arrays.toString(arrayPrint)); //вывести массив
        }
        /*
        результат:
        Укажите количество элементов в массиве (не более 1000):
        10
        Перечислите элементы массива через пробел:
        32 32 32 64 64 64 12 12 12 1
        [1, 12, 32, 64]
         */
    }
}
