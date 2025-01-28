package Module9_KorotaevaSA.Middle.Task2;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean push(int money) {
        if (money > balance) {
            System.out.println("Недостаточно средств на счёте " + accountNumber);
            System.out.println("Сумма на счете " + accountNumber + ": " + balance);
            System.out.println("Сумма перевода: " + money);
            return false;
        }
        balance -= money;
        return true;
    }

    public void pop(int money) {
        balance += money;
    }
}
