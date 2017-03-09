package science.duanxu.leetcode.easy;

/**
 * 409. Longest Palindrome
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q409_LongestPalindrome {
    private final int ALPHABET_NUM = 26;

    public int longestPalindrome(String s) {
        int[] UpperCount = new int[ALPHABET_NUM];
        int[] LowerCount = new int[ALPHABET_NUM];

        for (char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                UpperCount[ch - 'A']++;
            } else {
                LowerCount[ch - 'a']++;
            }
        }

        int length = 0, flag = 0;
        for (int i = 0; i < ALPHABET_NUM; i++) {
            if((UpperCount[i] & 1) == 0) {
                length += UpperCount[i];
            } else {
                flag = 1;
                length += UpperCount[i] >> 1 << 1;
            }

            if((LowerCount[i] & 1) == 0) {
                length += LowerCount[i];
            } else {
                flag = 1;
                length += LowerCount[i] >> 1 << 1;
            }
        }

        return length + flag;
    }
}
