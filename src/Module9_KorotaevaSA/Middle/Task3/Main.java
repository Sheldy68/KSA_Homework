package Module9_KorotaevaSA.Middle.Task3;

public class Main {
    public static void main(String[] args) {
        /*
        Парковка.
        Создайте объект парковка класса Parking. У парковки есть ограниченное количество мест, допустим 20. Также есть
        метод push() — позволяет машине заехать на парковку, и метод pop(), который освобождает место, когда машина
        уезжает. Если свободных мест на парковке не осталось, то нужно запретить машинам заезжать на парковку, пока
        какая-нибудь машина не уедет и не освободит место.
        Создайте объекты класса Car и в методе main заполните ими парковку. Не забывайте закрывать private поля для
        классов.
         */
        Parking parking = new Parking(5);// 20 - это ту мач, и 5 хватит для примера

        // Заполним парковку
        Car car1 = new Car("A123AA");
        Car car2 = new Car("A124AA");

        // Заезд на парковку
        parking.push(car1);
        parking.push(car2);

        // Проверка доступных мест
        System.out.println("Доступно мест: " + parking.availableSpaces());

        // Выезд с парковки первой машины из списка
        parking.pop();

        // Проверка доступных мест после выезда
        System.out.println("Доступно мест: " + parking.availableSpaces());

        // Заполнение парковки машинами динамически
        for (int i = 123; i <= 125; i++) {
            parking.push(new Car("Z" + i + "ZZ"));
        }

        // Проверка доступных мест после попытки заполнения
        System.out.println("Доступные места: " + parking.availableSpaces());

        // Выезд с парковки
        parking.pop();

        // Проверка доступных мест после попытки заполнения
        System.out.println("Доступные места: " + parking.availableSpaces());

        // Заполнение парковки машинами динамически еще
        for (int i = 126; i <= 130; i++) {
            parking.push(new Car("Z" + i + "ZZ"));
        }
    }
    /* Результат
    Машина A123AA припарковалась.
    Машина A124AA припарковалась.
    Доступно мест: 3
    Машина с номером A123AA уехала с парковки
    Доступно мест: 4
    Машина Z123ZZ припарковалась.
    Машина Z124ZZ припарковалась.
    Машина Z125ZZ припарковалась.
    Доступные места: 1
    Машина с номером A124AA уехала с парковки
    Доступные места: 2
    Машина Z126ZZ припарковалась.
    Машина Z127ZZ припарковалась.
    Нет свободных мест! Машина Z128ZZ не может припарковаться.
    Нет свободных мест! Машина Z129ZZ не может припарковаться.
    Нет свободных мест! Машина Z130ZZ не может припарковаться.
     */
}
