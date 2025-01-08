package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.FactorialLessThanEqualToN;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FactorialLessThanEqualToNTests {

    @Test
    public void Test1() {
        assertEquals(Stream.of(1L, 2L).toList(), FactorialLessThanEqualToN.factorialNumbers(3));
    }

    @Test
    public void Test2() {
        assertEquals(Stream.of(1L, 2L).toList(), FactorialLessThanEqualToN.factorialNumbers(2));
    }

    @Test
    public void Test3() {
        assertEquals(Stream.of(1L).toList(), FactorialLessThanEqualToN.factorialNumbers(1L));
    }

    @Test
    public void Test4() {
        assertEquals(Stream.of(1L, 2L, 6L).toList(), FactorialLessThanEqualToN.factorialNumbers(23L));
    }

    @Test
    public void Test5() {
        assertEquals(Stream.of(1L, 2L, 6L, 24L).toList(), FactorialLessThanEqualToN.factorialNumbers(40L));
    }
}
