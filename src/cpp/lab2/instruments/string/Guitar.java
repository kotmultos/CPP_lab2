package cpp.lab2.instruments.string;

public class Guitar extends StringInstrument{
    public Guitar(int yearOfProduction, double price, String caption) {
        super(yearOfProduction, price, caption, 6);
    }

    @Override
    public String getSound() {
        return "Rock! You are playing the guitar";
    }
}
