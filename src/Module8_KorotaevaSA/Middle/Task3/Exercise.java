package Module8_KorotaevaSA.Middle.Task3;

public abstract class Exercise {
    protected String name;

    public Exercise(String name) {
        this.name = name;
    }

    public abstract int ccalPerMinute();

    public String getName() {
        return name;
    }

    public int WorkOutCalc(int minutes) {
        return ( this.ccalPerMinute() * minutes );
    }

}
