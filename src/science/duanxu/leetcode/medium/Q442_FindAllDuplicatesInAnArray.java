package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 442. Find All Duplicates in an Array
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q442_FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new LinkedList<>();
        if (nums == null || nums.length == 0) return result;

        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int index = nums[i] - 1;
            if (nums[i] < 0) {
                index = -nums[i] - N - 1;
            }

            if (nums[i] > N) {
                index = nums[i] - N - 1;
            }

            if (nums[index] > N) {
                nums[index] = -nums[index];
            } else {
                nums[index] = nums[index] + N;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}