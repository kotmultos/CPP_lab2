package cpp.lab2.instruments.string;

import cpp.lab2.instruments.Instrument;

public class StringInstrument extends Instrument {
    protected int stringsCount;

    public StringInstrument(int yearOfProduction, double price, String caption, int stringsCount) {
        super(yearOfProduction, price, caption);
        this.stringsCount = stringsCount;
    }

    @Override
    public String play() {
        return "You are playing a string instrument!";
    }

    @Override
    public String toString() {
        return "Item: " + caption + " Type: " + getClass().getName()  + " Production: " + yearOfProduction
                + " Price: " + price + " Strings: " + stringsCount;
    }
}
