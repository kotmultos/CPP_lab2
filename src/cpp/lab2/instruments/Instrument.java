package cpp.lab2.instruments;

public abstract class Instrument implements IPlayable{
    protected int yearOfProduction;
    protected double price;
    protected String caption;

    public Instrument(int yearOfProduction, double price, String caption) {
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Item: " + caption + " Type: " + getClass().getName()  + " Production: " + yearOfProduction
                + " Price: " + price;
    }
}
