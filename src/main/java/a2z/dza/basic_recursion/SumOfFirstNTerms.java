// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
package a2z.dza.basic_recursion;

public class SumOfFirstNTerms {
    public static int sumOfSeries(int n) {
        if (n != 0) {
            return sumOfSeries(n - 1) + (int) Math.pow(n, 3);
        } else {
            return 0;
        }
    }
}
