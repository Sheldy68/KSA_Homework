package Module7_KorotaevaSA.Middle.Task2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private int computerNumber;
    final static int maxNmber = 10;
    public int attemptCounter;
    public int mode = 0;//инициализация режима игры
    Scanner scanner = new Scanner(System.in);

    //конструктор. Инициализация числа, загаданного компьютером
    public GuessGame() {
        Random random = new Random();
        computerNumber = random.nextInt(maxNmber) + 1;
    }
    public void setMode() {
        System.out.print("Выберите режим игры: 1 - неограниченное число попыток, 2 - 3 попытки: ");
        mode = scanner.nextInt();
    }

    public int getMode() {
        return mode ;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public void addAttempt() {
        attemptCounter++;
    }

    public int getAttemptNumber() {
        return attemptCounter;
    }

    public static boolean isNumber( String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
