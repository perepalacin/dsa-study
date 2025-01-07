package a2z.dza.basics;

public class LCMAndGCD {

    public static int[] lcmAndGcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return new int[] {Math.min(a, b) * (Math.max(a, b) / gcd), gcd};
    }
}
