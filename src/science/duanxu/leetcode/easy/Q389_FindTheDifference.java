package science.duanxu.leetcode.easy;

/**
 * 389. Find The Difference
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        final int ALPHABET_NUM = 26;
        int[] countS = new int[ALPHABET_NUM];
        int[] countT = new int[ALPHABET_NUM];

        for (char ch : s.toCharArray()) {
            countS[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            countT[ch - 'a']++;
        }

        for (int i = 0; i < ALPHABET_NUM; i++) {
            if(countS[i] != countT[i]) {
                return (char)('a' + i);
            }
        }

        return 'a';
    }
}
