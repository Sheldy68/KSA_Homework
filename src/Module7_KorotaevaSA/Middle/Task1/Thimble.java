package Module7_KorotaevaSA.Middle.Task1;

import java.util.Random;

public class Thimble {
    private int realThimble;
    private Random random;

    public Thimble() {
        random = new Random();
    }

    public int showNumberThimble() {
        return realThimble;
    }

    public void shuffleThimbles() {
        // перемешаем напрестки
        realThimble = random.nextInt(3) + 1;
    }
}
