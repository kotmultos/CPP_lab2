package cpp.lab2.instruments;

import java.util.List;

public class DisplayManger {
    public static void display(List<Instrument> list) {
        System.out.printf("\n%-25s|%-25s|%-25s|%-25s|%-25s|Additional info\n", "Type","Instrument", "Caption", "Production year", "Price");
        for (Instrument elem : list) {
            System.out.println(elem);
        }
    }
}
