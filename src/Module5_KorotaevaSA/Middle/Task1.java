package Module5_KorotaevaSA.Middle;

public class Task1 {
    //Задан массив целочисленных чисел, вывести сумму всех чисел массива.
    public static void main(String[] args) {
        int summ = 0;
        int values[] = {6, 7, 9, 5, 3, 4};

        for (int i = 0; i < values.length; i++) {
            summ = summ + values[i];
        }
        System.out.println(summ);
    }

}
