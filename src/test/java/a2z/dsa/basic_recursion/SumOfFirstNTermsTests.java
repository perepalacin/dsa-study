package a2z.dsa.basic_recursion;

import a2z.dza.basic_recursion.SumOfFirstNTerms;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfFirstNTermsTests {

    @Test
    public void Test1 () {
        assertEquals(SumOfFirstNTerms.sumOfSeries(5), 225);
    }

    @Test
    public void Test2 () {
        assertEquals(SumOfFirstNTerms.sumOfSeries(7), 784);
    }

}
