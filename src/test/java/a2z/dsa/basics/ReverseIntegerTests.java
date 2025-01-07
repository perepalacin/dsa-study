package a2z.dsa.basics;

import a2z.dza.basics.CountDigits;
import a2z.dza.basics.ReverseInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTests {

    @Test
    public void Test1 () {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    public void Test2 () {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    public void Test3 () {
        assertEquals(21, ReverseInteger.reverse(120));
    }

    @Test
    public void Test4 () {
        assertEquals(2, ReverseInteger.reverse(2000));
    }

    @Test
    public void Test5 () {
        assertEquals(1002, ReverseInteger.reverse(2001));
    }

    @Test
    public void Test6 () {
        assertEquals(109, ReverseInteger.reverse(901000));
    }

    @Test
    public void Test7() {
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }

    @Test
    public void Test8(){
        assertEquals(0, ReverseInteger.reverse(-2147483648));
    }

    @Test
    public void Test9(){
        assertEquals(0, ReverseInteger.reverse(2147483647));
    }
}
