package a2z.dsa.basics;

import a2z.dza.basics.CountDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDigitsTests {

    @Test
    public void Test1 () {
        assertEquals(2, CountDigits.evenlyDivides(12));
    }

    @Test
    public void Test2 () {
        assertEquals(1, CountDigits.evenlyDivides(2446));
    }

    @Test
    public void Test3 () {
        assertEquals(0, CountDigits.evenlyDivides(23));
    }

    @Test
    public void Test4 () {
        assertEquals(1, CountDigits.evenlyDivides(20));
    }


}
