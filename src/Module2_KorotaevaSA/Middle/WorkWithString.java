package Module2_KorotaevaSA.Middle;

import java.util.Scanner;

public class WorkWithString {

    public static void main(String[] args) {
        /*
        Задана строка «Hello Java!».
        Найти номер буквы «J» при помощи операции .indexOf()
        Вывести строку в верхнем регистре (то есть заглавными буквами) с помощью операции .toUpperCase()
        */
        String s = "Hello Java!";
        System.out.println("Поиск символа «J» - " + s.indexOf('J'));
        System.out.println("Возведение в верхний регистр - " + s.toUpperCase());
        /*
        Считать с консоли строку и вывести её длину на экран. Для этого воспользуйтесь операцией .length()
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любой текст:");
        String text = scan.nextLine();
        System.out.println("Размер строки - " + text.length());
        /* результаты:
        Поиск символа <<J>> - 6
        Возведение в верхний регистр - HELLO JAVA!
        Введите любой текст:
        Это текст для примера!
        Размер строки - 22
         */
    }
}
