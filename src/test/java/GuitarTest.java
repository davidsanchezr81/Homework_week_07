import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Black", "Guitar", 6, 150,100);
    }

    @Test
    public void getSound(){
        assertEquals("Chiung, chiung", guitar.sound());
    }

    @Test
    public void canHaveStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canHaveMade(){
        assertEquals("Fender", guitar.getMade());
    }

    @Test
    public void canHaveSellingPrice(){
        assertEquals(150, guitar.getSellingprice());
    }

    @Test
    public void canHaveBuyingPrice(){
        assertEquals(100, guitar.getBuyingprice());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(50, guitar.calculateMarkup());
    }
}
