package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

/**
 * 553. Optimal Division
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q553_OptimalDivision {
    /**
     * 计算最优分割
     * @param nums 输入数组
     * @return 最优分割
     */
    public String optimalDivision(int[] nums) {
        StringBuilder builder = new StringBuilder();
        builder.append(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (i == 1 && nums.length > 2) {
                builder.append("/(").append(nums[i]);
            } else {
                builder.append("/").append(nums[i]);
            }
        }

        return nums.length > 2 ? builder.append(")").toString() : builder.toString();
    }
}
