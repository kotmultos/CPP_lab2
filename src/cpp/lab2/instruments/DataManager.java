package cpp.lab2.instruments;

import cpp.lab2.instruments.keyboard.*;
import cpp.lab2.instruments.percussion.*;
import cpp.lab2.instruments.string.*;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    public static List<Instrument> getMockData() {
        List<Instrument> res = new ArrayList<Instrument>();
        res.add(new Guitar(2020, 120.35, "Cort 10'000"));
        res.add(new Bass(2020, 120.35, "Bass 10'000"));
        res.add(new Violin(2020, 120.35, "Violin 300"));
        res.add(new Piano(2020, 120.35, "piano 300", 66));
        res.add(new Pianoforte(2020, 120.35, "pianoforte 300", 66));
        res.add(new Synthesizer(2020, 120.35, "synthesizer 500", 88));
        res.add(new BassDrum(2020, 120.35, "synthesizer 500", 43.21));
        res.add(new SnareDrum(2020, 120.35, "synthesizer 500", 22.11));
        res.add(new DrumPlate(2020, 120.35, "synthesizer 500", 30.456));

        return res;
    }
}
