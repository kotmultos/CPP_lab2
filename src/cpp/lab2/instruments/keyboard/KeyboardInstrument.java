package cpp.lab2.instruments.keyboard;

import cpp.lab2.instruments.Instrument;


// синтезатор
// піаніно
// рояль

public abstract class KeyboardInstrument extends Instrument {
    protected int keysCount;

    public KeyboardInstrument(int yearOfProduction, double price, String caption, int keysCount) {
        super(yearOfProduction, price, caption);
        this.keysCount = keysCount;
    }

    @Override
    public String toString() {
        return super.toString() + "\tkeys: " + keysCount;
    }
}
