import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Shoptest {

    Shop shop;
    Guitar guitar;



    @Before
    public void before(){
        guitar = new Guitar("Fender", "Black", "Guitar", 6, 150, 100);
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

}
