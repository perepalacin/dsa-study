package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.Print1ToNWithoutLoop;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Print1ToNWithoutLoopTests {

    @Test
    public void Test1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Print1ToNWithoutLoop.printNos(10); // I will assume items is already initialized properly.

        assertEquals("1 2 3 4 5 6 7 8 9 10", outContent.toString());
    }

    @Test
    public void Test2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Print1ToNWithoutLoop.printNos(5); // I will assume items is already initialized properly.

        assertEquals("1 2 3 4 5", outContent.toString());
    }

    @Test
    public void Test3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Print1ToNWithoutLoop.printNos(1); // I will assume items is already initialized properly.

        assertEquals("1", outContent.toString());
    }

}
