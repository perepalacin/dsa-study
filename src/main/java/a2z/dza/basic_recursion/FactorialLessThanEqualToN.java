//  https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
package a2z.dza.basic_recursion;

import java.util.ArrayList;

public class FactorialLessThanEqualToN {
    public static ArrayList<Long> factorialNumbers(long n) {
        if (n == 0) {
            return new ArrayList<>();
        } else {
            ArrayList<Long> result = factorialNumbers(n -1);
            if (result.isEmpty()) {
                result.add(1L);
            } else {
                result.add(result.get(result.size() -1)*n);
            }
            return (ArrayList<Long>) result.stream().filter(item -> item <= n);
        }
    }

    public static void main (String[] args) {
        System.out.println(factorialNumbers(6).toString());
    }
}
