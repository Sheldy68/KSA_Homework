package Module9_KorotaevaSA.Middle.Task2;

public class Bank {
    private BankAccount[] accounts;
    private int size; // размер массива

    public Bank(int numberOfAccounts) {
        accounts = new BankAccount[numberOfAccounts];
        size = 0; //инициализация размера
    }

    public void addAccount(BankAccount account) {
        if (size >= accounts.length) {
            //если превысит текущий размер, увеличим вдвое
            BankAccount[] newAccounts = new BankAccount[accounts.length * 2];
            //перекладываем
            System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);
            accounts = newAccounts;
        }
        accounts[size] = account;
        size++; //увеличиваем размер массива
    }

    //    // Приватный. Нужен только, чтобы сверить счета внутри моей банковской системы
//    private BankAccount findAccount(String accountNumber) {
//        for (BankAccount account : accounts) {
//            if (account != null && account.getAccountNumber().equals(accountNumber)) {
//                return account;
//            }
//        }
//        return null;
//    }
    //переделаем на возврат индекса аккаунта или -1, если не найден
    private int findAccount(String accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
                return i; // Возвращаем индекс аккаунта
            }
        }
        return -1; // Возвращаем -1, если аккаунт не найден
    }

    public boolean transfers(String fromAccountNumber, String toAccountNumber, int money) {
//        BankAccount fromAccount = findAccount(fromAccountNumber);
//        BankAccount toAccount = findAccount(toAccountNumber);
        //сделаем через Index
        int fromIndex = findAccount(fromAccountNumber);
        int toIndex = findAccount(toAccountNumber);

//        if (fromAccount == null) {
          if (fromIndex == -1) {
            System.out.println("Счет " + fromAccountNumber + " не найден");
            return false;
        }
//        if (toAccount == null) {
          if (toIndex == -1) {
            System.out.println("Счет " + toAccountNumber + " не найден");
            return false;
        }

        BankAccount fromAccount = accounts[fromIndex];
        BankAccount toAccount   = accounts[toIndex];

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
