import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before(){
        strings = new Strings("Pipe", "Guitar strings", 10.00, 5.00);
    }

    @Test
    public void getMade(){
        assertEquals("Pipe", strings.getMade());
    }

    @Test
    public void getType(){
        assertEquals("Guitar strings", strings.getType());
    }

    @Test
    public void canHaveSellingPrice(){
        assertEquals(10.00, strings.getSellingprice(),0.01);
    }

    @Test
    public void canHaveBuyingPrice(){
        assertEquals(5.00, strings.getBuyingprice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5.00, strings.calculateMarkup(), 0.01);
    }

}
