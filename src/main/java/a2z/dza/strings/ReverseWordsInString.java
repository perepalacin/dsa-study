// https://leetcode.com/problems/reverse-words-in-a-string/submissions/1561897219/
package a2z.dza.strings;

import java.util.Stack;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        Stack<String> reversedWords = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && !word.isEmpty()) {
                reversedWords.push(word.toString());
                word = new StringBuilder();
            } else if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
        }

        if (!word.isEmpty()) {
            reversedWords.push(word.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!reversedWords.empty()) {
            result.append(reversedWords.pop());
            if (!reversedWords.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
