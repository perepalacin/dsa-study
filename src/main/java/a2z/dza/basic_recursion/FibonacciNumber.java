//https://leetcode.com/problems/fibonacci-number/description/
package a2z.dza.basic_recursion;

public class FibonacciNumber {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
