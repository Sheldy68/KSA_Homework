package Module8_KorotaevaSA.Middle.Task3;

public class Swimming extends Exercise{
    public Swimming() {
        super("Плавание");
    }

    @Override
    public int ccalPerMinute() {
        return 30;
    }
}
