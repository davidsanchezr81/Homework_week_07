
import javax.sound.midi.Instrument;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instruments> instrumentstock;
    private ArrayList<InstrumentsParts> instrumentpartststock;

    public Shop(String name){
        this.name = name;
        instrumentstock = new ArrayList<Instruments>();
        instrumentpartststock = new ArrayList<InstrumentsParts>();

    }

    public String getName(){
        return this.name;
    }

    public void addInstrumentToStock(Instruments instrument){
        instrumentstock.add(instrument);
    }

    public void removeInstrumentFromStock(Instruments instrument){
        instrumentstock.remove(instrument);
    }


    public void addInstrumentPartToStock(InstrumentsParts instrumentpart){
        instrumentpartststock.add(instrumentpart);
    }

    public void removeInstrumentPartFromStock(InstrumentsParts instrumentpart){
        instrumentpartststock.remove(instrumentpart);
    }

    public int countInstruments(){
        return this.instrumentstock.size();
    }

    public int countInstrumentsParts(){
        return this.instrumentpartststock.size();
    }

    public double totalProfitOnInstruments() {
        double profit = 0;
        for(Instruments instrument : instrumentstock) {
            profit += instrument.calculateMarkup();
        }
        return profit;
    }

    public double totalProfitOnInstrumentParts() {
        double profitonparts = 0;
        for(InstrumentsParts instrumentpart : instrumentpartststock) {
            profitonparts += instrumentpart.calculateMarkup();
        }
        return profitonparts;
    }


}
