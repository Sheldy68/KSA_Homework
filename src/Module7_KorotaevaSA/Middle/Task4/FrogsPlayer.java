package Module7_KorotaevaSA.Middle.Task4;

import java.util.Random;

public class FrogsPlayer {
    private String name;
    final static int MAX_NUMBER = 6;
    public int counter;

    public FrogsPlayer(String name) {
        this.name = name;
        counter = 0; // инициализация очков игрока
    }

    public String getName() {
        return name;
    }

    public int makeMove() {
        Random random = new Random();
        int number = random.nextInt(MAX_NUMBER) + 1;
        System.out.println(name + ", число на Вашем кубике: " + number);
        return number;
    }

    public void addCounter(int move){
        counter += move;
    }

    public int getCounter(){
        return counter;
    }
}
