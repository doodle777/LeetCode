package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.ListNode;

import java.util.Stack;

/**
 * 477. Total Hamming Distance
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q477_TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j = 0; j < 32; j++) {
            int bitCount = 0;
            for (int i = 0; i < n; i++)
                bitCount += (nums[i] >> j) & 1;
            total += bitCount * (n - bitCount);
        }
        return total;
    }
}