package Module8_KorotaevaSA.Easy;

public class Duck extends Animal{
    @Override
    public void walk() {
        System.out.println("Я - утка. Лечу-лечу");
    }

    @Override
    public void say() {
        System.out.println("Кря-кря");
    }
}
