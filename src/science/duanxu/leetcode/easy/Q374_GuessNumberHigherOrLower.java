package science.duanxu.leetcode.easy;

/**
 * 374. Guess Number Higher or Lower
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q374_GuessNumberHigherOrLower {
    /** The guess API is defined in the parent class GuessGame.
     * @param num, your guess
     * @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
     * int guess(int num);
     */
    private int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}
