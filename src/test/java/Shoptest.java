import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Shoptest {

    Shop shop;
    Guitar guitar;
    Guitar guitar1;



    @Before
    public void before(){
        guitar = new Guitar("Fender", "Black", "String", 6, 150, 100);
        guitar1 = new Guitar("Marshall", "White", "String", 4, 200, 100);

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
    public void canGetTotalProfit(){
        shop.addInstrumentToStock(guitar);
        shop.addInstrumentToStock(guitar1);
        assertEquals(150, shop.totalProfit(),0.01);
    }

}
