package cpp.lab2.instruments.string;

public class Violin extends StringInstrument{
    public Violin(int yearOfProduction, double price, String caption) {
        super(yearOfProduction, price, caption, 4);
    }

    @Override
    public String getSound() {
        return "Tu-ru-rum-pum! You are playing the violin;";
    }

}
