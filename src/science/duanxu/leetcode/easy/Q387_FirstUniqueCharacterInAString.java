package science.duanxu.leetcode.easy;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 387. First Unique Character in a String
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q387_FirstUniqueCharacterInAString {
    private final int ALPHABET_NUM = 26;

    public int firstUniqChar(String s) {
        int[] count = new int[ALPHABET_NUM];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
