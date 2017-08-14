package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

/**
 * 540. Single Element in a Sorted Array
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q540_SingleElementInASortedArray {
    /**
     * 计算数组中的单独元素
     * @param nums 数组
     * @return 单独元素
     */
    public int singleNonDuplicate(int[] nums) {
        if (null == nums || nums.length == 0) {
            throw new ArrayIndexOutOfBoundsException(-1);
        }

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
