package Module5_KorotaevaSA.Middle;

public class Task5 {
    public static void main(String[] args) {
        /*
        Задан двумерный массив размера N на N, где N находится в пределах от 1 до 10. Каждый элемент массива — число.
        Необходимо вывести сумму чисел, которые находятся на главной диагонали массива. Главная диагональ - это
        элементы с индексами 0:0, 1:1, 2:2 … N:N.
         */
        int [][] twoDimArray = {{3, 5, 6, 7, 8}, {6, 9, 8, 3, 1}, {6, 2, 3, 1, 4}, {8, 9, 6, 3, 1}, {3, 3, 3, 3, 3}};
        int res = 0;
        System.out.printf("Значения чисел по диагонали:"); //printf чтобы было без пустой строки по отношен. к след.
        for (int i=0; i<twoDimArray[0].length; i++) {
            int j = i;
            res = res + twoDimArray[i][j] ;
            System.out.printf("\ntwoDimArray[%d][%d] = %d", i, j, twoDimArray[i][j]);
        }
        System.out.println("\nРезультат суммы чисел на главной диагонали: " + res);
        /*
        Результат:
        Значения чисел по диагонали:
            twoDimArray[0][0] = 3
            twoDimArray[1][1] = 9
            twoDimArray[2][2] = 3
            twoDimArray[3][3] = 3
            twoDimArray[4][4] = 3
            Результат суммы чисел на главной диагонали: 21
         */
    }
}
