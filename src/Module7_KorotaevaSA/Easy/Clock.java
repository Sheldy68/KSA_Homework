package Module7_KorotaevaSA.Easy;

import java.time.LocalDateTime;

public class Clock {

    public static void showTime(){
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Текущее время: " + timeNow);
    }

}
