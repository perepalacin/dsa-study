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
