package science.duanxu.leetcode.easy;

/**
 * 461. Hamming Distance
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q461_HammingDistance {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0) {
            count += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }

        return count;
    }
}
