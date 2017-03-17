package science.duanxu.leetcode.medium;

import java.util.*;

/**
 * 503. Next Greater Element II
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q503_NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int[] result = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < result.length * 2; i++) {
            int index = i % result.length;
            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                result[stack.pop()] = nums[index];
            }

            stack.push(index);
        }

        return result;
    }
}