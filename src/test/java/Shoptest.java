import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Shoptest {

    Shop shop;
    Guitar guitar;
    Guitar guitar1;
    Strings strings;
    Strings strings1;


    @Before
    public void before(){
        guitar = new Guitar("Fender", "Black", "String", 6, 150, 100, InstType.Guitar);
        guitar1 = new Guitar("Marshall", "White", "String", 4, 200, 100,InstType.Guitar);
        strings = new Strings("Pitfall", "string", 20, 10);
        strings1 = new Strings("Wicked", "string", 30, 10);
        shop = new Shop("The Reggae shop");
    }

    @Test
    public void canGetShopName(){
        assertEquals("The Reggae shop", shop.getName());
    }

    @Test
    public void canAddInstrumentsToStock(){
        shop.addInstrumentToStock(guitar);
        assertEquals(1, shop.countInstruments());

    }

    @Test
    public void canRemoveInstrumentsToStock(){
        shop.addInstrumentToStock(guitar);
        assertEquals(1, shop.countInstruments());
        shop.removeInstrumentFromStock(guitar);
        assertEquals(0, shop.countInstruments());

    }

    @Test
    public void canAddInstrumentsPartToStock(){
        shop.addInstrumentPartToStock(strings);
        assertEquals(1, shop.countInstrumentsParts());

    }

    @Test
    public void canRemoveInstrumentsPartToStock(){
        shop.addInstrumentPartToStock(strings);
        assertEquals(1, shop.countInstrumentsParts());
        shop.removeInstrumentPartFromStock(strings);
        assertEquals(0, shop.countInstrumentsParts());

    }

    @Test
    public void canGetTotalProfitOnInstruments(){
        shop.addInstrumentToStock(guitar);
        shop.addInstrumentToStock(guitar1);
        assertEquals(150, shop.totalProfitOnInstruments(),0.01);
    }

    @Test
    public void canGetTotalProfitOnInstrumentParts(){
        shop.addInstrumentPartToStock(strings);
        shop.addInstrumentPartToStock(strings1);
        assertEquals(30, shop.totalProfitOnInstrumentParts(),0.01);
    }

}
