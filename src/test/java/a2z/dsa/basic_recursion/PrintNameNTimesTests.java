package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.PrintNameNTimes;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintNameNTimesTests {
    @Test
    public void Test1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNameNTimes.printNameNTimes(5); // I will assume items is already initialized properly.

        assertEquals("GFG GFG GFG GFG GFG ", outContent.toString());
    }

}
