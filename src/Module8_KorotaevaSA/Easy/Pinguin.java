package Module8_KorotaevaSA.Easy;

public class Pinguin extends Animal{
    @Override
    public void walk() {
        System.out.println("Я - пингвин. Я скольжу");
    }

    @Override
    public void say() {
        System.out.println("Пик-пик!");
    }
}
