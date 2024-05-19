package Module2_KorotaevaSA.Hard;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        /*
        Заданы координаты вершин треугольника, необходимо вычислить площадь. Для этого сначала необходимо найти длины
        сторон треугольника, а затем вычислить площадь треугольника по длинам сторон.
         */

        Scanner scanner = new Scanner(System.in);
        final int count_0 = 0;
        final int count_2 = 2;

        System.out.println("Задайте координаты треугольника для точки A:");
        int[] getA = new int[count_2]; //зададим массив для A
        for (int i = count_0; i < count_2; i++) { //запись вводимых значений с консоли в массив
            getA[i] = scanner.nextInt();
        }
        System.out.printf("Точка A(%d,%d)", getA[0],  getA[1]);

        System.out.println("\nЗадайте координаты треугольника для точки B:");
        int[] getB = new int[count_2]; //зададим массив для B
        for (int i = count_0; i < count_2; i++) { //запись вводимых значений с консоли в массив
            getB[i] = scanner.nextInt();
        }
        System.out.printf("Точка B(%d,%d)", getB[0],  getB[1]);

        System.out.println("\nЗадайте координаты треугольника для точки C:");
        int[] getC = new int[count_2]; //зададим массив для C
        for (int i = count_0; i < count_2; i++) { //запись вводимых значений с консоли в массив
            getC[i] = scanner.nextInt();
        }
        System.out.printf("Точка C(%d,%d)", getC[0],  getC[1]);

        double distAB = Math.sqrt(Math.pow((getB[0] - getA[0]),2) + Math.pow((getB[1] - getA[1]),2));
        System.out.println("\nДлина AB = " + distAB);

        double distAC = Math.sqrt(Math.pow((getC[0] - getA[0]),2) + Math.pow((getC[1] - getA[1]),2));
        System.out.println("Длина AC = " + distAC);

        double distBC = Math.sqrt(Math.pow((getC[0] - getB[0]),2) + Math.pow((getC[1] - getB[1]),2));
        System.out.println("Длина BC = " + distBC);

        // площадь через полупериметр S = корень кв из (p(p-a)(p-b)(p-c))
        double p = (distAB + distAC + distBC) / 2;
        double S = Math.sqrt(p * ( p - distAB ) * ( p - distAC ) * ( p - distBC ));
        System.out.println("Площадь треугольника равна = " + S);
        /* результат
        Задайте координаты треугольника для точки A:
        0
        0
        Точка A(0,0)
        Задайте координаты треугольника для точки B:
        30
        40
        Точка B(30,40)
        Задайте координаты треугольника для точки C:
        65
        120
        Точка C(65,120)
        Длина AB = 50.0
        Длина AC = 136.4734406395618
        Длина BC = 87.32124598286491
        Площадь треугольника равна = 499.999999999999
         */
    }
}
