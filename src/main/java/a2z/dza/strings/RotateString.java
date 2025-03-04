// https://leetcode.com/problems/rotate-string/submissions/1561928822/
package a2z.dza.strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String completeString = s+s;
        return completeString.contains(goal);
    }
}
