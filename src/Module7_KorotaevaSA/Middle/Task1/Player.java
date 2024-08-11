package Module7_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class Player {
    private String name;
    private int winCounter = 0; // счетчик побед
    private int winCounterComp = 0; // счетчик побед

    public void increaseWinCounter() {
        System.out.println("Вы угадали, получите балл!");
        winCounter++;
    }
    public void increaseWinCounterComp() {
        System.out.println("Вы ошиблись!");
        winCounterComp++;
    }
    public int getWinCounter() {
        return winCounter;
    }

    public int getWinCounterComp() {
        return winCounterComp;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeTry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", введите номер наперстка: ");
        return scanner.nextInt();
    }
}
