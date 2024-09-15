package Module8_KorotaevaSA.Middle.Task2;

import java.util.Scanner;

public class Fridge {
    private final int fridgeVolume;
    private int currentVolume;
    private boolean exit;

    public Fridge(int fridgeVolume) {
        this.fridgeVolume = fridgeVolume;
        this.currentVolume = 0;
    }

    public void addProduct(Product product) {
        if (currentVolume + product.getVolume() <= fridgeVolume) {
            currentVolume += product.getVolume();
            System.out.println("Продукт: " + product.getName() + " добавлен в холодильник" );
        } else {
            System.out.println("Объем холодильника превышен! Не возможно добавить " + product.getName());
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getFridgeVolume() {
        return fridgeVolume;
    }

    public boolean getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вы хотите продолжить? 1 - да или 2 - нет: ");
        String answer = scanner.nextLine();
        while (!isNumber(answer)) {
            System.out.println("Неверный ввод!");
            answer = scanner.nextLine();
        }
        switch (Integer.parseInt(answer)) {
            case (1):
                exit = false;
                break;
            case (2):
                exit = true;
                break;
            default:
                exit = true;
                break;
        }
        return exit;
    }

    public static boolean isNumber( String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
