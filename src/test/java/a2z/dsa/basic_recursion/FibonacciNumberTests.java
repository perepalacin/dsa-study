package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.FibonacciNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTests {
    @Test
    public void Test1() {
        assertEquals(1, FibonacciNumber.fib(2));
    }

    @Test
    public void Test2() {
        assertEquals(2, FibonacciNumber.fib(3));
    }

    @Test
    public void Test3() {
        assertEquals(3, FibonacciNumber.fib(4));
    }

    @Test
    public void Test4() {
        assertEquals(5, FibonacciNumber.fib(5));
    }

    @Test
    public void Test5() {
        assertEquals(8, FibonacciNumber.fib(6));
    }

    @Test
    public void Test6() {
        assertEquals(13, FibonacciNumber.fib(7));
    }
}
