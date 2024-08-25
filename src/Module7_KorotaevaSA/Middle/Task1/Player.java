package Module7_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class Player {
    private String name;
    private int winCounter = 0; // счетчик побед

    public Player(String name) {
        this.name = name;
    }

    public void increaseWinCounter() {
        winCounter++;
    }

    public int getWinCounter() {
        return winCounter;
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
