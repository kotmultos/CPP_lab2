package cpp.lab2.instruments.keyboard;

public class Synthesizer extends KeyboardInstrument{
    public Synthesizer(int yearOfProduction, double price, String caption, int keysCount) {
        super(yearOfProduction, price, caption, keysCount);
    }

    @Override
    public String getSound() {
        return "[electrical sound]: Tra-ta-ta ta ra ta ta! You are playing the synthesizer";
    }
}
