package Module7_KorotaevaSA.Middle.Task4;

import java.util.Random;

public class FrogsPlayer {
    private String name;
    final static int maxNumber = 6;

    public FrogsPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeMove() {
        Random random = new Random();
        int number = random.nextInt(maxNumber) + 1;
        System.out.println(name + ", число на Вашем кубике: " + number);
        return number;
    }
}
