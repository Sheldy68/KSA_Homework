package Module8_KorotaevaSA.Middle.Task2;

import java.util.Scanner;

public class FridgeMain {
    public static void main(String[] args) {
        boolean exit;

        Fridge fridge = new Fridge(70);
        System.out.println("Максимальный объем холодильника: " + fridge.getFridgeVolume());

        Scanner scanner = new Scanner(System.in);
        exit = false;
        do {
            System.out.println("Какой продукт положить в холодильник: 1 - хлеб; 2 - молоко; 3 - яйца; 4 - мясо; " +
                    " 5 - морковь?");
            int action = scanner.nextInt();
            if (action >= 1 & action <= 5) {
                //действия пользователя
                switch (action) {
                    case (1): {
                        Product bread = new Bread(10);
                        fridge.addProduct(bread);
                        exit = fridge.getAnswer();
                        break;
                    }
                    case (2): {
                        Product milk = new Milk(10);
                        fridge.addProduct(milk);
                        exit = fridge.getAnswer();
                        break;
                    }
                    case (3): {
                        Product eggs = new Eggs(5);
                        fridge.addProduct(eggs);
                        exit = fridge.getAnswer();
                        break;
                    }
                    case (4): {
                        Product meat = new Meat(20);
                        fridge.addProduct(meat);
                        exit = fridge.getAnswer();
                        break;
                    }
                    case (5): {
                        Product carrot = new Carrot(15);
                        fridge.addProduct(carrot);
                        exit = fridge.getAnswer();
                        break;
                    }
                }
                System.out.println("Объем заполнения холодильника: " + fridge.getCurrentVolume());
            } else {
                System.out.println("Не корректный ввод");
            }
        } while (!exit);

    }
}
