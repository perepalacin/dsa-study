package a2z.dza.basics;

// https://www.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigits {

    public static int evenlyDivides(int n) {
        int remainingDigits = n;
        int result = 0;
        while (remainingDigits != 0) {
            int lastDigit = remainingDigits % 10;
            if (lastDigit != 0 && n % lastDigit == 0) {
                result++;
            }
            remainingDigits = (remainingDigits - lastDigit) / 10;
        }
        return result;
    }

}
