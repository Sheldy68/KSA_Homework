package Module7_KorotaevaSA.Middle.Task4;

import java.util.Scanner;

public class FrogsGame {

    final static int MAX_COUNTER = 30;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок 1, введите ваше имя: ");
        String playerName = scanner.nextLine();
        FrogsPlayer player1 = new FrogsPlayer(playerName);

        System.out.println("Игрок 2, введите ваше имя: ");
        playerName = scanner.nextLine();
        FrogsPlayer  player2 = new FrogsPlayer(playerName);

        //переключатель между игроками, проверяем по первому игроку
        boolean player1Turn = true;

        while (true) {
            // ход игроков
            int move;
            if (player1Turn) {
                move = player1.makeMove();
                player1.addCounter(move);
                System.out.println("Число очков 1 игрока: " + player1.getCounter());
            } else {
                move = player2.makeMove();
                player2.addCounter(move);
                System.out.println("Число очков 2 игрока: " + player2.getCounter());
            }
            // проверим, кто победил
            if ( player1.getCounter() >= MAX_COUNTER ){
                System.out.println("Игрок " + player2.getName() + " - проиграл!");
                System.out.println("Победил игрок " + player1.getName() + " с числом очков: " + player1.getCounter());
                break;
            } else if ( player2.getCounter() >= MAX_COUNTER ){
                System.out.println("Игрок " + player1.getName() + " - проиграл!");
                System.out.println("Победил игрок " + player2.getName() + " с числом очков: " + player2.getCounter());
                break;
            }
            //переключаем очередь хода
            player1Turn = !player1Turn;
        }
        System.out.println("Игра окончена!");
    }
}
