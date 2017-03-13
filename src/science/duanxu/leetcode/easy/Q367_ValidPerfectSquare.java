package science.duanxu.leetcode.easy;

/**
 * 367. Valid Perfect Square
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num;
        while (low < high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
