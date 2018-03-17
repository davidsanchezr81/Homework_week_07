
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

    public int countInstruments(){
        return this.instrumentstock.size();
    }

    public double totalProfit() {
        double profit = 0;
        for(Instruments instrument : instrumentstock) {
            profit += instrument.calculateMarkup();
        }
        return profit;
    }







}
