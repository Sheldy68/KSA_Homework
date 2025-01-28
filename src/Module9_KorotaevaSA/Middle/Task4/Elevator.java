package Module9_KorotaevaSA.Middle.Task4;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private static final int MAX_LOAD = 500; // Максимальная грузоподъемность
    private List<Cargo> cargoList; // Список грузов
    private int currentLoad; // Текущая загрузка лифта
    private boolean isEnabled; // Способен ли лифт ехать

    public Elevator() {
        this.cargoList = new ArrayList<>();
        this.currentLoad = 0;
        this.isEnabled = true; // Инициализация. Способен ехать
    }

    public void add(Cargo cargo) {
        if ((currentLoad + cargo.getWeight()) > MAX_LOAD) {
            System.out.println(cargo.getName() + " Не может быть добавлен. Перегруз!");
            isEnabled = false; // Лифт не может ехать
        } else {
            cargoList.add(cargo);
            currentLoad += cargo.getWeight();
            System.out.println(cargo.getName() + " добавлен. Текущая загрузка лифта в кг: " + currentLoad);
        }
    }

    public void push() {
        if (isEnabled) {
            System.out.println("Лифт может ехать");
        } else {
            System.out.println("Лифт не может ехать!");
        }
    }

    public void pop() {
        if (!cargoList.isEmpty()) {
            System.out.println("Выгружаем груз:");
            for (Cargo cargo : cargoList) {
                System.out.println(cargo.getName());
            }
            // Освобождаем лифт
            currentLoad = 0;
            cargoList.clear();
            isEnabled = true; // Лифт способен ехать
            System.out.println("Лифт разгружен");
        } else {
            System.out.println("Лифт пуст");
        }
    }
}
