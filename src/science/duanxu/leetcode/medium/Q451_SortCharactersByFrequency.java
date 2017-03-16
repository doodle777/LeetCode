package science.duanxu.leetcode.medium;

import java.util.*;

/**
 * 451. Sort Characters By Frequency
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q451_SortCharactersByFrequency {
    public String frequencySort(String s) {
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int chCount = map.getOrDefault(ch, 0) + 1;
            maxCount = Math.max(maxCount, chCount);
            map.put(ch, chCount);
        }

        String[] bucket = new String[maxCount + 1];
        for (char ch : map.keySet()) {
            int count = map.get(ch);
            if (bucket[count] == null) {
                bucket[count] = String.valueOf(ch);
            } else {
                bucket[count] = bucket[count] + ch;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = bucket.length - 1; i > 0; i--) {
            if (bucket[i] != null) {
                for (int len = 0; len < bucket[i].length(); len++) {
                    for (int c = 0; c < i; c++) {
                        sb.append(bucket[i].charAt(len));
                    }
                }
            }
        }

        return sb.toString();
    }
}