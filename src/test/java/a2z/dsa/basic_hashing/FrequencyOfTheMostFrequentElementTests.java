package a2z.dsa.basic_hashing;

import a2z.dza.basic_hashing.FrequencyOfTheMostFrequentElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrequencyOfTheMostFrequentElementTests {

    @Test
    public void Test1() {
        assertEquals(3, FrequencyOfTheMostFrequentElement.maxFrequency(new int[] {1, 2, 4}, 5));
    }

    @Test
    public void Test2() {
        assertEquals(2, FrequencyOfTheMostFrequentElement.maxFrequency(new int[] {1, 4, 8, 13}, 5));
    }

    @Test
    public void Test3() {
        assertEquals(1, FrequencyOfTheMostFrequentElement.maxFrequency(new int[] {3, 9, 6}, 2));
    }

    @Test
    public void Test4() {

    }
}
