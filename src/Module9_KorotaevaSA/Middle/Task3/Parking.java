package Module9_KorotaevaSA.Middle.Task3;

import java.util.LinkedList;
import java.util.Queue;

public class Parking {
    private final int capacity; // вместимость парковки
    private final Queue<Car> parkedCars;//список машин

    public Parking(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new LinkedList<>();
    }

    // заехать на парковку
    public boolean push(Car car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            System.out.println("Машина " + car.getCarNumberID() + " припарковалась.");
            return true;
        } else {
            System.out.println("Нет свободных мест! Машина " + car.getCarNumberID() + " не может припарковаться.");
            return false;
        }
    }

    //выезд с парковки
    public Car pop() {
        if (!parkedCars.isEmpty()) {
            Car car = parkedCars.poll(); //poll удаляет из списка
            System.out.println("Машина с номером " + car.getCarNumberID() + " уехала с парковки");
            return car;
        } else {
            System.out.println("Парковка пуста!");
            return null;
        }
    }

    public int availableSpaces() {
        return capacity - parkedCars.size();
    }
}
