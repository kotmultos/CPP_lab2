package cpp.lab2.instruments;

import cpp.lab2.instruments.keyboard.*;
import cpp.lab2.instruments.percussion.*;
import cpp.lab2.instruments.string.*;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    public static List<Instrument> getMockData() {
        List<Instrument> res = new ArrayList<Instrument>();
        res.add(new Guitar(2022, 6_614, "CORT G110"));
        res.add(new Guitar(2020, 9_158, "CORT KX100"));
        res.add(new Bass(2005, 9_446, "Fanndec GPB-4410 RD"));
        res.add(new Bass(2017, 11_190, "Yamaha TRBX-174 RM"));
        res.add(new Violin(2019, 3_085, "Rafaga AF 1/4"));
        res.add(new Violin(2019, 3_364, "Maxtone TV3/4A LL"));
        res.add(new Piano(2019, 166_335, "Pearl River UP118M", 88));
        res.add(new Piano(2013, 387_828, "Yamaha U1 PDAW", 88));
        res.add(new Pianoforte(2022, 859_041, "Yamaha GC1 PE", 88));
        res.add(new Pianoforte(2016, 548_079, "Kawai GL10 MEP", 88));
        res.add(new Synthesizer(2008, 15_290, "Casio CT-X3000", 61));
        res.add(new Synthesizer(2021, 23_310, "Korg i3 MB ", 61));
        res.add(new BassDrum(2019, 20_381, "Pearl VMX-2418B/C280", 24));
        res.add(new BassDrum(2022, 78_798, "Yamaha AMB2218", 22));
        res.add(new SnareDrum(2018, 2_425, "Maxtone SDC601", 14));
        res.add(new SnareDrum(2020, 4_132, "Peace SD-101", 14));
        res.add(new DrumPlate(2017, 1_005, "PAISTE PST3 SPLASH 10", 10));
        res.add(new DrumPlate(2022, 1_141, "MAXTONE CD1410", 14));

        return res;
    }
}
