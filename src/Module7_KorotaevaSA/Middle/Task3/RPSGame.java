package Module7_KorotaevaSA.Middle.Task3;

import java.util.Scanner;

public class RPSGame {

    public static boolean isNumber( String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void play() {
        int guessUser = 0; // инициализация ответа пользователя
        int guessComputer = 0; // инициализация ответа компа

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String playerName = scanner.nextLine();

        RPSPlayer user = new RPSPlayer(playerName);
        RPSPlayer computer = new RPSPlayer("Компьютер");

        while (guessUser == guessComputer) {
            // ход игрока и компа
            guessUser = user.makeGuess();
            guessComputer = computer.makeGuessComp();
            System.out.println("Компьютер выбрал: " + guessComputer);
            // проверим, кто победил
            if (guessUser == guessComputer) {
                System.out.println("Ничья! Продолжаем");
            } else if ((guessUser == 0 && guessComputer == 1) ||
                      (guessUser == 1 && guessComputer == 2) ||
                      (guessUser == 2 && guessComputer == 0)) {
                System.out.println("Победил: " + user.getName());
            } else {
                System.out.println("Победил: " + computer.getName());
            }
        }
        System.out.println("Игра окончена!");
    }
}
