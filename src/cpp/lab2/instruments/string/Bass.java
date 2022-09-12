package cpp.lab2.instruments.string;

public class Bass extends StringInstrument{
    public Bass(int yearOfProduction, double price, String caption) {
        super(yearOfProduction, price, caption, 4);
    }

    @Override
    public String play() {
        return "Boom, boom! You are playing on bass guitar";
    }


}
