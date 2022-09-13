package cpp.lab2;

import  cpp.lab2.instruments.*;
import cpp.lab2.instruments.string.Bass;
import cpp.lab2.instruments.string.Guitar;
import cpp.lab2.instruments.string.Violin;

public class Store {
    public static void main(String[] args) {
        System.out.println("Dobriy den' everybody!");

        Instrument a = new Guitar(2020, 120.35, "Cort 10'000");
        Instrument b = new Bass(2020, 120.35, "Bass 10'000");
        Instrument c = new Violin(2020, 120.35, "Violin 300");

        Instrument [] arr = {a,b,c};

        for (Instrument elem:arr      ) {
            System.out.println(elem.getSound());
        }

    }
}