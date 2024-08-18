package Module7_KorotaevaSA.Middle.Task1;

import java.util.Random;

public class Thimble {

    private boolean isThisThimble;

    public Thimble() {
        isThisThimble = false;
    }

    public boolean checkThimble(){
        return isThisThimble;
    }

    public static int shuffleThimbles() {
        // перемешаем напрестки
        Random random = new Random();
        return random.nextInt(3);
    }

    public void setThimbleTrue() {
        isThisThimble = true;
    }

    public void setThimbleFalse() {
        isThisThimble = false;
    }
}
