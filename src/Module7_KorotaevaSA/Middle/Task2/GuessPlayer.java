package Module7_KorotaevaSA.Middle.Task2;

import java.util.Scanner;

public class GuessPlayer {
    private String name;

    public GuessPlayer(String name) {
        this.name = name;
    }

    public String makeGuess(int mode) {
        Scanner scanner = new Scanner(System.in);
        if (mode == 1) {
            System.out.print(name + ", введите число от 1 до 10 или exit для выхода: ");
        } else {
            System.out.print(name + ", введите число от 1 до 10: ");
        }
        return scanner.nextLine().toLowerCase();
    }

}
