package Module8_KorotaevaSA.Middle.Task3;

import java.util.Scanner;

public class WorkOutCalcMain {
    public static void main(String[] args) {
        int joggingTime;
        int jumpRopeTime;
        int swimmingTime;
        int joggingCcal;
        int jumpRopeCcal;
        int swimmingCcal;

        Exercise jogging = new Jogging();
        Exercise jumpRope = new JumpRope();
        Exercise swimming = new Swimming();

        System.out.println("Выберите активность 1 - бег, 2 - прыжки на скакалке, 3 - плавание");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        System.out.println("Укажите количество минут активности: ");

        if (action >= 1 & action <= 3) {
            //действия пользователя
            switch (action) {
                case (1): {
                    joggingTime = scanner.nextInt();
                    joggingCcal = jogging.WorkOutCalc(joggingTime);
                    System.out.println("Потрачено ккал за " + joggingTime + " минут " + jogging.getName() + ": " + joggingCcal);
                    break;
                }
                case (2): {
                    jumpRopeTime = scanner.nextInt();
                    jumpRopeCcal = jumpRope.WorkOutCalc(jumpRopeTime);
                    System.out.println("Потрачено ккал за " + jumpRopeTime + " минут " + jumpRope.getName() + ": " + jumpRopeCcal);
                    break;
                }
                case (3): {
                    swimmingTime = scanner.nextInt();
                    swimmingCcal = swimming.WorkOutCalc(swimmingTime);
                    System.out.println("Потрачено ккал за " + swimmingTime + " минут " + swimming.getName() + ": " + swimmingCcal);
                    break;
                }
            }
        } else {
            System.out.println("Не корректный ввод");
        }
    }
}
