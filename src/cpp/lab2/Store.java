package cpp.lab2;

import  cpp.lab2.instruments.*;
import cpp.lab2.instruments.keyboard.*;
//import cpp.lab2.instruments.keyboard.Piano;
//import cpp.lab2.instruments.keyboard.Pianoforte;
//import cpp.lab2.instruments.keyboard.Synthesizer;
import cpp.lab2.instruments.percussion.BassDrum;
import cpp.lab2.instruments.percussion.DrumPlate;
import cpp.lab2.instruments.percussion.SnareDrum;
import cpp.lab2.instruments.string.*;
//import cpp.lab2.instruments.string.Bass;
//import cpp.lab2.instruments.string.Guitar;
//import cpp.lab2.instruments.string.Violin;

import javax.swing.plaf.synth.SynthSplitPaneUI;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.Arrays;
import java.util.List;

public class Store {
    public static void main(String[] args) {

        List<Instrument> instrumentList = DataManager.getMockData();

        System.out.println("Content of the shop:");
        DisplayManger.display(instrumentList);

        System.out.println("Search for type:");
        SearchForTypeDemo(instrumentList);

        System.out.println("Content of the Search for band:");
        SearchForBandSet(instrumentList);

    }

    public static void SearchForTypeDemo(List<Instrument> list) {
        var res = SearchManager.searchForType(list, "PercussionInstrument");
        System.out.println("Percussion Instruments: ");
        DisplayManger.display(res);
    }

    public static void SearchForBandSet(List<Instrument> list) {
        var forBand = SearchManager.searchForBandSet(list);
        System.out.println("What we propose to a band:");
        DisplayManger.display(forBand);
    }
}