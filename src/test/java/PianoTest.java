import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Hemmingway", "White", "Keyboard", 1, 2000,1000);

    }

    @Test
    public void canHaveSound(){
        assertEquals("Plong, Plong",piano.sound());
    }

    @Test
    public void canHaveMade(){
        assertEquals("Hemmingway", piano.getMade());
    }

    @Test
    public void canHaveColour(){
        assertEquals("White", piano.getColour());
    }

    @Test
    public void canHaveType(){
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void canHavePedal(){
        assertEquals(1,piano.getPedal());
    }
    @Test
    public void canHaveSellingPrice(){
        assertEquals(2000.00, piano.getSellingprice(),0.01);
    }

    @Test
    public void canHaveBuyingPrice(){
        assertEquals(1000.00, piano.getBuyingprice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1.00, piano.calculateMarkup(), 0.01);
    }



}
