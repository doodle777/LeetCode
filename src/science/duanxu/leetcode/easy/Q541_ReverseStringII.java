package science.duanxu.leetcode.easy;

/**
 * 541. Reverse String II
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q541_ReverseStringII {
    private void reverseImpl(char[] chars, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            chars[i] ^= chars[j];
            chars[j] ^= chars[i];
            chars[i] ^= chars[j];
        }
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int i = 0;
        while ((i+1)*2*k <= chars.length) {
            reverseImpl(chars, i * 2 * k, (i+1)*2*k - k);
            i++;
        }

        int last = Math.min(chars.length, i * 2 * k + k);
        reverseImpl(chars, i * 2 * k, last);

        return new String(chars);
    }

    public static void main(String[] args) {
//        System.out.print(reverseStr("abcdefg", 2));
    }
}
