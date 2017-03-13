package science.duanxu.leetcode.easy;

/**
 * 441. Arranging Coins
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q441_ArrangingCoins {
    public int arrangeCoins(int n) {
        long low = 0, high = n;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            long left = mid * (mid + 1) / 2;
            long right = (mid + 1) * (mid + 2) / 2;

            if (left <= n && n < right) {
                return (int)mid;
            } else if (left < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)low;
    }
}
