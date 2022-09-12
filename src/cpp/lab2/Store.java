package cpp.lab2;

import  cpp.lab2.instruments.*;
import cpp.lab2.instruments.string.Guitar;

public class Store {
    public static void main(String[] args) {
        System.out.println("Dobriy den' everybody!");

        Instrument a = new Guitar(2020, 120.35, "Cort 10'000");

        System.out.println(a);
        System.out.printf(a.play());


    }
}