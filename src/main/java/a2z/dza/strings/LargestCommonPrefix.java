// https://leetcode.com/problems/longest-common-prefix/
package a2z.dza.strings;

public class LargestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        boolean foundEnd = false;
        StringBuilder result = new StringBuilder();
        while (1 < 2) {
            char currentCharacter = ' ';
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    foundEnd = true;
                    break;
                }

                if (j == 0) {
                    currentCharacter = strs[j].charAt(i);
                } else if (strs[j].charAt(i)!=currentCharacter){
                    foundEnd = true;
                    break;
                }

            }
            i++;
            if (foundEnd) {
                break;
            } else {
                result.append(currentCharacter);
            }
        }
        return result.toString();
    }
}
