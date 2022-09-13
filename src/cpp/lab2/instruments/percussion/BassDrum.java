package cpp.lab2.instruments.percussion;

public class BassDrum extends PercussionInstrument{
    public BassDrum(int yearOfProduction, double price, String caption, double diameter) {
        super(yearOfProduction, price, caption, diameter);
    }

    @Override
    public String getSound() {
        return "Bumm...bum...bum! You're playing the BassDrum";
    }
}
