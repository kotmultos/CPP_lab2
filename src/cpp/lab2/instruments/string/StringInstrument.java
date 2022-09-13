package cpp.lab2.instruments.string;

import cpp.lab2.instruments.Instrument;

public abstract class StringInstrument extends Instrument {
    protected int stringsCount;

    public StringInstrument(int yearOfProduction, double price, String caption, int stringsCount) {
        super(yearOfProduction, price, caption);
        this.stringsCount = stringsCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Strings: " + stringsCount;
    }
}
