package science.duanxu.leetcode.easy;

import java.util.stream.Stream;

/**
 * 383. Ransom Note
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q383_RansomNote {
    private final int ALPHABET_NUM = 26;

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomCount = new int[ALPHABET_NUM];
        int[] magaziCount = new int[ALPHABET_NUM];

        for(char ch : ransomNote.toCharArray()) {
            ransomCount[ch - 'a']++;
        }

        for(char ch : magazine.toCharArray()) {
            magaziCount[ch - 'a']++;
        }

        for (int i = 0; i < ALPHABET_NUM; i++) {
            if(ransomCount[i] > magaziCount[i]) {
                return false;
            }
        }
        return true;
    }
}
