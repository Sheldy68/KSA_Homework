package Module7_KorotaevaSA.Middle.Task2;

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        /*
        Написать игру “Угадай число”.
        Должно быть 2 игрока. Первый (сама программа) загадывает число от 1 до 10. Второй должен угадать число, вводя
        его на клавиатуре. Если число больше предложенного, программа должна выводить “число больше”, если меньше — то
        “число меньше”. Должно быть 2 режима игры: без указания количество попыток и с ограниченным числом попыток.
        Игра должны быть написана в ООП стиле, с использованием классов и методов.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String playerName = scanner.nextLine();

        GuessGame game = new GuessGame();
        GuessPlayer user = new GuessPlayer(playerName);
        game.setMode();
        while (game.getMode() != 1 && game.getMode() != 2) {
            System.out.println("Неверный режим!");
            game.setMode();
        }

        game.addAttempt();

        int guessNumber = 0; //инициализируем число для ответа пользователя
        String guessString; // ответ пользователя

        while (guessNumber != game.getComputerNumber()) {
            if (game.getMode() == 2) {
                System.out.println("Попытка №" + game.getAttemptNumber());
            }
            // ход игрока
            guessString = user.makeGuess(game.getMode());
            if (guessString.equals("exit")) {
                break;
            } else if (GuessGame.isNumber(guessString))  {
                guessNumber = Integer.parseInt(guessString);
                // сверка числа с загаданным
                int computerNumber = game.getComputerNumber();
                if (guessNumber == computerNumber) {
                    System.out.println("Вы угадали!");
                    System.out.println("Загаданное число: " + computerNumber);
                    break;
                } else if (guessNumber < computerNumber) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                switch (game.getMode()) { // 1 - неограниченное число попыток, 2 - ограниченное число попыток
                    case 1:
                        break;
                    case 2:
                        if (game.getAttemptNumber() < 3) {
                            game.addAttempt();
                        } else {
                            guessNumber = computerNumber;
                            System.out.println("Загаданное число: " + computerNumber);
                        }
                }
            } else {
                System.out.println("Неверный ввод!");
            }
        }
        System.out.println("Игра окончена!");
    }
}
