package cpp.lab2.instruments;

import cpp.lab2.instruments.keyboard.Synthesizer;
import cpp.lab2.instruments.percussion.BassDrum;
import cpp.lab2.instruments.percussion.DrumPlate;
import cpp.lab2.instruments.percussion.SnareDrum;
import cpp.lab2.instruments.string.Bass;

import java.util.ArrayList;
import java.util.List;

public class SearchManager {

    public static List<Instrument> searchForType(List<Instrument> list, String searchFor) {
        List<Instrument> res = new ArrayList<Instrument>();

        for (Instrument elem : list) {
            if(elem.getClass().getSuperclass().getSimpleName().equals(searchFor) ) {
                res.add(elem);
            }
        }

        return res;
    }

    public static List<Instrument> searchForBandSet(List<Instrument> list) {
        List<Instrument> res = new ArrayList<Instrument>();
        String strSearchFor = "Guitar Bass Synthesizer BassDrum SnareDrum DrumPlate";

        for (Instrument elem : list) {
            if(strSearchFor.contains(elem.getClass().getSimpleName()) ) {
                res.add(elem);
            }
        }

        return res;
    }
}
