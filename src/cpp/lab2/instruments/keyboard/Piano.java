package cpp.lab2.instruments.keyboard;

public class Piano extends KeyboardInstrument{
    public Piano(int yearOfProduction, double price, String caption, int keysCount) {
        super(yearOfProduction, price, caption, keysCount);
    }

    @Override
    public String getSound() {
        return "[acoustic sound]: Tra-ta-ta ta ra ta ta! You are playing the piano";
    }
}
