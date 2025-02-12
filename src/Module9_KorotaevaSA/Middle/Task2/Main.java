package Module9_KorotaevaSA.Middle.Task2;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте свой банк, который может проводить операции с банковскими счетами.
        У банка (класс Bank) есть массив счетов — BankAccount, на которых лежат деньги. Банк может переводить деньги со
         счёта 1 на счёт 2 и т.д. Операция должна быть отклонена банком, если денег на счёте для перевода недостаточно.
         При написании программы не забывайте про модификаторы доступа (private, protected, public)
         */
        Bank bank = new Bank(2);

        // Создание банковских счетов
        BankAccount account1 = new BankAccount("11111", 1000);
        BankAccount account2 = new BankAccount("22222", 2000);

        // Добавление счетов в банк
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Переводы
        bank.transfers("11111", "22222", 500);
        bank.transfers("22222", "11111", 3000); // Ошибка по сумме
        bank.transfers("33333", "11111", 3000); // Ошибка по счету

        //еще один счет с расширением исходного массива
        BankAccount account4 = new BankAccount("44444", 4000);
        bank.addAccount(account4);
        bank.transfers("44444", "11111", 3000); //
    }
    /* Результат
    Перевод 500 с счёта 11111 на счёт 22222 проведен.
    Сумма на счете 22222: 2500
    Недостаточно средств на счёте 22222
    Сумма на счете 22222: 2500
    Сумма перевода: 3000
    Счет 33333 не найден
    Перевод 3000 с счёта 44444 на счёт 11111 проведен.
    Сумма на счете 11111: 3500
     */
}
