package Module9_KorotaevaSA.Middle.Task2;

public class Bank {
    private BankAccount[] accounts;

    public Bank(int numberOfAccounts) {
        accounts = new BankAccount[numberOfAccounts];
    }

    public void addAccount(BankAccount account, int index) {
        accounts[index] = account;
    }

    // Приватный. Нужен только, чтобы сверить счета внутри моей банковской системы
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public boolean transfers(String fromAccountNumber, String toAccountNumber, int money) {
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);

        if (fromAccount == null) {
            System.out.println("Счет " + fromAccountNumber + " не найден");
            return false;
        }
        if (toAccount == null) {
            System.out.println("Счет " + toAccountNumber + " не найден");
            return false;
        }

        if (fromAccount.push(money)) {
            toAccount.pop(money);
            System.out.println("Перевод " + money + " с счёта " + fromAccountNumber + " на счёт "
                    + toAccountNumber + " проведен.");
            System.out.println("Сумма на счете " + toAccountNumber + ": " + toAccount.getBalance());
            return true;
        }
        return false;
    }
}
