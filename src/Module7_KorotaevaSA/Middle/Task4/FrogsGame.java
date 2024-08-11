package Module7_KorotaevaSA.Middle.Task4;

import java.util.Scanner;

public class FrogsGame {
    private FrogsPlayer player1;
    private FrogsPlayer player2;
    public int player1Counter;
    public int player2Counter;
    final static int maxCounter = 30;

    //конструктор
    public FrogsGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок 1, введите ваше имя: ");
        String playerName = scanner.nextLine();
        player1 = new FrogsPlayer(playerName);

        System.out.println("Игрок 2, введите ваше имя: ");
        playerName = scanner.nextLine();
        player2 = new FrogsPlayer(playerName);

        player1Counter = 0; // инициализация очков для 1 игрока
        player2Counter = 0; // инициализация очков для 2 игрока
    }

    public void play() {
        //переключатель между игроками, проверяем по первому игроку
        boolean player1Turn = true;

        while ((player1Counter <= maxCounter) || (player2Counter <= maxCounter)) {
            // ход игроков
            int move;
            if (player1Turn) {
                move = player1.makeMove();
                player1Counter += move;
                System.out.println("Число очков 1 игрока: " + player1Counter);
            } else {
                move = player2.makeMove();
                player2Counter += move;
                System.out.println("Число очков 2 игрока: " + player2Counter);
            }
            // проверим, кто победил
            if ( player1Counter >= maxCounter ){
                System.out.println("Игрок " + player2.getName() + " - проиграл!");
                System.out.println("Победил игрок " + player1.getName() + " с числом очков: " + player1Counter);
                break;
            } else if ( player2Counter >= maxCounter ){
                System.out.println("Игрок " + player1.getName() + " - проиграл!");
                System.out.println("Победил игрок " + player2.getName() + " с числом очков: " + player2Counter);
                break;
            }
            //переключаем очередь хода
            player1Turn = !player1Turn;
        }
        System.out.println("Игра окончена!");
    }
}
