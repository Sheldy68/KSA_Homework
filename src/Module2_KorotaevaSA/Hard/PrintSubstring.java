package Module2_KorotaevaSA.Hard;

public class PrintSubstring {
    public static void main(String[] args) {
        /*
        Задана строка «Hello world!». Вывести подстроку с 6 по 11 символ.
         */
        String s = "Hello world!";
        System.out.println("Взятие подстроки c 6 по 11 символ в «Hello_world!» - " + s.substring(6,12));
        /* результат:
        Взятие подстроки c 6 по 11 символ в «Hello_world!» - world!
         */
    }
}
