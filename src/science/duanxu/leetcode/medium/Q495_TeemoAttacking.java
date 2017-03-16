package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 495. Teemo Attacking
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q495_TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            sum += Math.min(timeSeries[i+1] - timeSeries[i], duration);
        }

        if (timeSeries.length != 0) {
            sum += duration;
        }

        return sum;
    }
}