package science.duanxu.leetcode.medium;

/**
 * Q537_ComplexNumberMultiplication
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q647_PalindromicSubstrings {
    int count = 0;

    /**
     * 计算主过程
     * @param s 输入字符串
     * @return 回文子串数
     */
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) { // i is the mid point
            extendPalindrome(s, i, i); // odd length;
            extendPalindrome(s, i, i + 1); // even length
        }

        return count;
    }

    /**
     * 细化过程
     * @param s 输入字符串
     * @param left 左索引
     * @param right 右索引
     */
    private void extendPalindrome(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; left--; right++;
        }
    }
}
