package cpp.lab2.instruments;

public abstract class Instrument implements IPlayable{
    private int yearOfProduction;
    private double price;
    private String caption;

    public Instrument(int yearOfProduction, double price, String caption) {
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.caption = caption;
    }

    @Override
    public String toString() {
        return String.format("%-25s|%-25s|%-25s|%-25s|%-25s|", getClass().getSuperclass().getSimpleName(),
                getClass().getSimpleName(), caption, yearOfProduction, price);
    }
}
