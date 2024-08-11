package Module7_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class ThimbleGame {
    public static void main(String[] args) {
        /*
        Написать игру “Напёрстки”
        Компьютер прячет монетку в одном из трех стаканов. И предлагает угадать, в каком стакане монетка.
        Игра идёт до трех побед.
         */
        final int maxWins = 3; // максимальное число побед

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Thimble game = new Thimble();

        while ((player.getWinCounter() != maxWins) || (player.getWinCounterComp() != maxWins)) {
            // перемешаем наперстки
            game.shuffleThimbles();
            // ход игрока
            int answer = player.makeTry();
            // проверка наперстков
            int realTimber = game.showNumberThimble();
            if (answer == realTimber) {
                player.increaseWinCounter();
            } else {
                System.out.println("Монетка в наперстке: " + realTimber);
                player.increaseWinCounterComp();
            }
            System.out.println("Счет: " + player.getWinCounter() + ":" + player.getWinCounterComp());
            // проверим, кто победил
            if ( player.getWinCounter() == maxWins ){
                System.out.println("Игрок " + player.getName() + " - победил!");
                break;
            } else if ( player.getWinCounterComp() == maxWins ){
                System.out.println("Победил компьютер!");
                break;
            }
        }
        System.out.println("Игра окончена!");
    }
}
