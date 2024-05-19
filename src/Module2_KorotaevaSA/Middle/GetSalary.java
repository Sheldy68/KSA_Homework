package Module2_KorotaevaSA.Middle;

import java.util.Scanner;

public class GetSalary {
    /*
    Необходимо посчитать зарплату рабочего за месяц. На консоль вводится, сколько дней в месяце было отработано,
    дальше вводится вещественное число — зарплата за день. Нужно вывести зарплату рабочего за весь месяц.
    Например, если в месяце было отработано 10 дней, а зарплата в день была 5500.25 рублей, то программа должна вывести
    в результате — 55002.5
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество отработанных дней за месяц:");
        int days = scan.nextInt();
        System.out.println("Укажите оклад:");
        double salaryDay = scan.nextDouble();
        double wage = salaryDay * days;
        System.out.println("Ваша зарплата за месяц составит: " + wage);
        /* результат
        Укажите количество отработанных дней за месяц:
        10
        Укажите оклад:
        13670,85
        Ваша зарплата за месяц составит: 136708.5
        */
    }
}
