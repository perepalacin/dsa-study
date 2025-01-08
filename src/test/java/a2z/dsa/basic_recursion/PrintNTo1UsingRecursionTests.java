package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.PrintNTo1UsingRecursion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintNTo1UsingRecursionTests {
    @Test
    public void Test1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNTo1UsingRecursion.printNos(10); // I will assume items is already initialized properly.

        assertEquals("10 9 8 7 6 5 4 3 2 1 ", outContent.toString());
    }

    @Test
    public void Test2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNTo1UsingRecursion.printNos(5); // I will assume items is already initialized properly.

        assertEquals("5 4 3 2 1 ", outContent.toString());
    }

    @Test
    public void Test3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNTo1UsingRecursion.printNos(1); // I will assume items is already initialized properly.

        assertEquals("1 ", outContent.toString());
    }

}
