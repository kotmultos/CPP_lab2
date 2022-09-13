package cpp.lab2.instruments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortManager {

//    class InnerClass {
//
//    }
//    // static inner class
//    static class StaticInnerClass {
//        static List<Instrument> sortDescendingByPrice(List<Instrument> list) {
//
//        }
//    }
              //  inner class
//    static List<Instrument> sortAscendingByPrice(List<Instrument> list) {
//
//        }



    // анонімний клас
    public static List<Instrument> sortAscendingByType(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort(new Comparator<Instrument>() {
            public int compare(Instrument i1, Instrument i2) {
                return i1.getClass().getSuperclass().getSimpleName().
                        compareTo(i2.getClass().getSuperclass().getSimpleName());
            }
        } );

        return res;
    }

    // лямбда-вираз
    public static List<Instrument> sortDescendingByType(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort((Instrument i1, Instrument i2) ->
                i2.getClass().getSuperclass().getSimpleName().
                        compareTo(i1.getClass().getSuperclass().getSimpleName()));

        return res;
    }

}
