package Module9_KorotaevaSA.Middle.Task1;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    /*
Положить деньги на счет
 */
    public void pop(double money) {
        balance += money;
        System.out.println("Сумма на счете: " + balance);
    }

    /*
 Вывести деньги со счета
*/
    public void push(double money) {
        if (money > balance) {
            System.out.println("Недостаточно средств на счете для перевода суммы: " + money);
        } else {
            balance -= money;
            System.out.println("Сумма на счете: " + balance);
        }
    }
}
