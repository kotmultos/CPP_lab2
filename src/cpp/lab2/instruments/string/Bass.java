package cpp.lab2.instruments.string;

public class Bass extends StringInstrument{
    public Bass(int yearOfProduction, double price, String caption) {
        super(yearOfProduction, price, caption, 4);
    }

    @Override
    public String getSound() {
        return "Boom, boom! You are playing the bass guitar";
    }

}
