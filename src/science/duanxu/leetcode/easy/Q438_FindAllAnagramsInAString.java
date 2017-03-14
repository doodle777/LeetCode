package science.duanxu.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q438_FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        if (s == null || p == null || s.length() == 0 || p.length() == 0) {
            return result;
        }

        int[] hash = new int[256];
        for (char ch : p.toCharArray()) {
            hash[ch]++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) {
                count--;
            }

            if (count == 0) {
                result.add(left);
            }

            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
                count++;
            }
        }

        return result;
    }
}
