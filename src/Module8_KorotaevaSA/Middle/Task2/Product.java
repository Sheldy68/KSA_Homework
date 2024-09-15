package Module8_KorotaevaSA.Middle.Task2;

public abstract class Product {
    protected int volume;

    public Product(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public abstract String getName();
}

