package cpp.lab2.instruments.percussion;

import cpp.lab2.instruments.Instrument;


public abstract class PercussionInstrument extends Instrument {
    protected double diameter;

    public PercussionInstrument(int yearOfProduction, double price, String caption, double diameter) {
        super(yearOfProduction, price, caption);
    }

    @Override
    public String toString() {
        return super.toString() + "Diameter: " + diameter + " in.";
    }
}
