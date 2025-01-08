package a2z.dza.basic_recursion;

public class CheckIfAStringIsPalindrome {

    public static boolean mainFunction(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.isEmpty()) {
            return true;
        }
        return reverseString(s, 0, s.length()-1);
    }

    public static boolean reverseString (String s, int l, int r) {
        if (l == r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        if (l < r) {
            return reverseString(s, ++l, --r);
        }
        return true;
    }
}
