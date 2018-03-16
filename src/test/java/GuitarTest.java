import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Black", "Guitar", 6, 150.00,100.00);
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
        assertEquals(150.00, guitar.getSellingprice(), 0.01);
    }

    @Test
    public void canHaveBuyingPrice(){
        assertEquals(100.00, guitar.getBuyingprice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(0.50, guitar.calculateMarkup(), 0.01);
    }
}
