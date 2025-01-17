package a2z.dsa.arrays.easy;

import a2z.dza.arrays.easy.LongestSubArrayWithSumK;
import a2z.dza.arrays.easy.SubArraysThatSumK;
import org.junit.Assert;
import org.junit.Test;

public class SubArraysThatSumKTests {

        @Test
        public void Test1() {
            Assert.assertEquals(3, SubArraysThatSumK.subArraySum(new int[]{10, 5, 2, 7, 1, -10}, 15));
        }

        @Test
        public void Test2() {
            Assert.assertEquals(2, SubArraysThatSumK.subArraySum(new int[]{-5, 8, -14, 2, 4, 12},-5));
        }

        @Test
        public void Test3() {
            Assert.assertEquals(0, SubArraysThatSumK.subArraySum(new int[]{10, -10, 20, 30}, 5 ));
        }

        @Test
        public void Test4() {
            Assert.assertEquals(2, SubArraysThatSumK.subArraySum(new int[]{1, 1, 1}, 2 ));
        }

        @Test
        public void Test5() {
            Assert.assertEquals(2, SubArraysThatSumK.subArraySum(new int[]{1, 2, 3}, 3 ));
        }

        @Test
        public void Test6() {
            Assert.assertEquals(55, SubArraysThatSumK.subArraySum(new int[]{0,0,0,0,0,0,0,0,0,0}, 0 ));
        }

}
