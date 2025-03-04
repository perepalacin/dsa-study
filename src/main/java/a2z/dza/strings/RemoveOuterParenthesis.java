// https://leetcode.com/problems/remove-outermost-parentheses/description/
package a2z.dza.strings;

public class RemoveOuterParenthesis {
    public static String removeOuterParentheses(String s) {
        boolean parenthesisOpen = false;
        StringBuilder result = new StringBuilder();
        int countParenthesis = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && !parenthesisOpen) {
                parenthesisOpen = true;
            } else if ( parenthesisOpen && countParenthesis == 0 && s.charAt(i) == ')') {
                parenthesisOpen = false;
            } else {
                if (s.charAt(i) == '(') {
                    countParenthesis++;
                } else {
                    countParenthesis--;
                }
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
