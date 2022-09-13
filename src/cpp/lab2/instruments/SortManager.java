package cpp.lab2.instruments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortManager {


  // static inner class

    class ComparatorInnerClass implements Comparator<Instrument>{
        @Override
        public int compare(Instrument i1, Instrument i2) {
            return (int)(i1.getPrice() - i2.getPrice());
        }
    }
    // inner class
    public List<Instrument> sortAscendingByPrice(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort(new ComparatorInnerClass());

        return res;
    }


    //    static class StaticInnerClass
    static class ComparatorStaticInnerClass implements Comparator<Instrument>{
        @Override
        public int compare(Instrument i1, Instrument i2) {
            return (int)(i2.getPrice() - i1.getPrice());
        }
    }
    public static List<Instrument> sortDescendingByPrice(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort(new SortManager.ComparatorStaticInnerClass());

        return res;
    }



    // анонімний клас
    public List<Instrument> sortAscendingByType(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort(new Comparator<Instrument>() {
            public int compare(Instrument i1, Instrument i2) {
                return i2.getClass().getSuperclass().getSimpleName().
                        compareTo(i1.getClass().getSuperclass().getSimpleName());
            }
        } );

        return res;
    }

    // лямбда-вираз
    public List<Instrument> sortDescendingByType(List<Instrument> list) {
        var res = new ArrayList<>(list);

        res.sort((Instrument i1, Instrument i2) ->
                i1.getClass().getSuperclass().getSimpleName().
                        compareTo(i2.getClass().getSuperclass().getSimpleName()));

        return res;
    }

}
