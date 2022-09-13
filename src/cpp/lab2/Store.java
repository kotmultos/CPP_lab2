package cpp.lab2;

import  cpp.lab2.instruments.*;
import cpp.lab2.instruments.keyboard.*;
//import cpp.lab2.instruments.keyboard.Piano;
//import cpp.lab2.instruments.keyboard.Pianoforte;
//import cpp.lab2.instruments.keyboard.Synthesizer;
import cpp.lab2.instruments.string.*;
//import cpp.lab2.instruments.string.Bass;
//import cpp.lab2.instruments.string.Guitar;
//import cpp.lab2.instruments.string.Violin;

import java.util.Arrays;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        System.out.println("Dobriy den' everybody!");

        Instrument a = new Guitar(2020, 120.35, "Cort 10'000");
        Instrument b = new Bass(2020, 120.35, "Bass 10'000");
        Instrument c = new Violin(2020, 120.35, "Violin 300");
        Instrument d = new Piano(2020, 120.35, "piano 300", 66);
        Instrument e = new Pianoforte(2020, 120.35, "pianoforte 300", 66);
        Instrument f = new Synthesizer(2020, 120.35, "synthesizer 500", 88);


        Instrument [] arr = {a,b,c,d,e,f};

        List<Instrument> instrumentList = Arrays.asList(arr);

//        for (Instrument elem:arr) {
//            System.out.println(elem.getSound());
//        }

       DisplayManger.display(instrumentList);

    }
}