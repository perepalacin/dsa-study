// https://leetcode.com/problems/isomorphic-strings/submissions/1561921534/
package a2z.dza.strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mappings = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mappings.containsKey(s.charAt(i))) {
                if (mappings.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if (mappings.containsValue(t.charAt(i))) {
                return false;
            } else {
                mappings.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
