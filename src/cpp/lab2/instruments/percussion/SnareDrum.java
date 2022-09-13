package cpp.lab2.instruments.percussion;

public class SnareDrum extends PercussionInstrument {
    public SnareDrum(int yearOfProduction, double price, String caption, double diameter) {
        super(yearOfProduction, price, caption, diameter);
    }

    @Override
    public String getSound() {
        return "Tuts tuts tuts! You're playing the Snare Drum";
    }
}
