package Module9_KorotaevaSA.Middle.Task1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    /*
Положить деньги на счет
 */
    public void pop(int money) {
        balance += money;
        System.out.println("Сумма на счете: " + balance);
    }

    /*
 Вывести деньги со счета
*/
    public void push(int money) {
        if (money > balance) {
            System.out.println("Недостаточно средств на счете для перевода суммы: " + money);
        } else {
            balance -= money;
            System.out.println("Сумма на счете: " + balance);
        }
    }
}
