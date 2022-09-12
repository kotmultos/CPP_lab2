package cpp.lab2.instruments.string;

public class Guitar extends StringInstrument{
    public Guitar(int yearOfProduction, double price, String caption) {
        super(yearOfProduction, price, caption, 6);
    }

    @Override
    public String play() {
        return "You are playing the guitar";
    }

    @Override
    public String toString() {
        return "\nType: " + getClass().getName() + "\nCaption: " + caption + "\nYear: " + yearOfProduction
                + "\nPrice: " + price + "\nStrings: " + stringsCount;
    }
}
