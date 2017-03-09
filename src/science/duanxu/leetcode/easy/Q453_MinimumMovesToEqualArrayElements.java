package science.duanxu.leetcode.easy;

import java.util.Arrays;

/**
 * 453. Minimum Moves to Equal Array Elements
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q453_MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            moves += num - min;
        }
        return moves;
    }
}
