package cpp.lab2.instruments;

import java.util.List;

public class DisplayManger {
    public static void display(List<Instrument> list) {

//        System.out.println("Type\tCaption\tPrice\tProduction year");
        System.out.printf("%-25s|%-25s|%-25s|%-25s|\n","Type", "Caption", "Price", "Production year");
        for (Instrument elem : list) {
            System.out.println(elem);
        }
    }
}
