package a2z.dza.strings;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (frequencies.containsKey(c)) {
                if (frequencies.get(c) == 0) {
                    return false;
                }
                frequencies.replace(c, frequencies.get(c) - 1);
            } else {
                return false;
            }
        }

        for (int value : frequencies.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
