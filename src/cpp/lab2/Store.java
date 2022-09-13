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

//        System.out.println("Content of the shop:");
//        DisplayManger.display(instrumentList);

//        SearchForTypeDemo(instrumentList);      // пошук за типом
//        SearchForBandSetDemo(instrumentList);   // пошук інструментів для гурту

        SortDemo(instrumentList);
    }

    public static void SearchForTypeDemo(List<Instrument> list) {
        var res = SearchManager.searchForType(list, "PercussionInstrument");
        System.out.println("Percussion Instruments: ");
        DisplayManger.display(res);
    }

    public static void SearchForBandSetDemo(List<Instrument> list) {
        var forBand = SearchManager.searchForBandSet(list);
        System.out.println("What we propose to a band:");
        DisplayManger.display(forBand);
    }

    public static void SortDemo(List<Instrument> list){
        var sortManager = new SortManager();
        var sortedByTypeDescending = sortManager.sortDescendingByType(list);
        DisplayManger.display(sortedByTypeDescending);

        var sortedByTypeAscending = sortManager.sortAscendingByType(sortedByTypeDescending);
        DisplayManger.display(sortedByTypeAscending);

        var sortedByPriceAscending = sortManager.sortAscendingByType(sortedByTypeAscending);
        DisplayManger.display(sortedByPriceAscending);

        var sortedByTypePriceDescending = sortManager.sortAscendingByType(sortedByPriceAscending);
        DisplayManger.display(sortedByTypePriceDescending);
    }
}