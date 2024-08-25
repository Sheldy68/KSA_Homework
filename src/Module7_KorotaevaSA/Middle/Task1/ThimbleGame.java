package Module7_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class ThimbleGame {
    public static void main(String[] args) {
        /*
        Написать игру “Напёрстки”
        Компьютер прячет монетку в одном из трех стаканов. И предлагает угадать, в каком стакане монетка.
        Игра идёт до трех побед.
         */
        final int MAX_WINS = 3; // максимальное число побед

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Player comp = new Player("Компьютер");
        Thimble game = new Thimble();

        while (true) {
            // перемешаем наперстки
            game.shuffleThimbles();
            // ход игрока
            int answer = player.makeTry();
            // проверка наперстков
            int realTimber = game.showNumberThimble();
            if (answer == realTimber) {
                System.out.println("Вы угадали, получите балл!");
                player.increaseWinCounter();
            } else {
                System.out.println("Вы ошиблись!");
                System.out.println("Монетка в наперстке: " + realTimber);
                comp.increaseWinCounter();
            }
            System.out.println("Счет: " + player.getWinCounter() + ":" + comp.getWinCounter());
            // проверим, кто победил
            if (player.getWinCounter() == MAX_WINS) {
                System.out.println("Игрок " + player.getName() + " - победил!");
                break;
            } else if (comp.getWinCounter() == MAX_WINS) {
                System.out.println("Победил компьютер!");
                break;
            }
        }
        System.out.println("Игра окончена!");
    }
}
