package Module7_KorotaevaSA.Middle.Task3;

import java.util.Random;
import java.util.Scanner;

public class RPSPlayer {
    private String name;
    final static int maxNmber = 3;
    private String answer;

    public RPSPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", введите число: 0-камень, 1-ножницы, 2-бумага: ");
        answer = scanner.nextLine();
        while (RPSGame.isNumber(answer) != true) {
            System.out.println("Неверный ввод!");
            answer = scanner.nextLine();
        }
        return Integer.parseInt(answer);
    }

    public int makeGuessComp() {
        Random random = new Random();
        return random.nextInt(maxNmber);
    }
}
