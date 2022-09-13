package cpp.lab2.instruments.percussion;

public class DrumPlate extends PercussionInstrument{
    public DrumPlate(int yearOfProduction, double price, String caption, double diameter) {
        super(yearOfProduction, price, caption, diameter);
        this.diameter = diameter;
    }

    @Override
    public String getSound() {
        return "TS ts ts! You're playing the DrumPlate";
    }
}
