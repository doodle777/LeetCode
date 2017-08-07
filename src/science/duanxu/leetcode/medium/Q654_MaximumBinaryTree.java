package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

/**
 * 654. Maximum Binary Tree
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q654_MaximumBinaryTree {
    /**
     * 寻找区间最大值的下标
     * @param nums 数列
     * @param left 左限
     * @param right 右限
     * @return 最大值下标
     */
    private int findMax(int[] nums, int left, int right) {
        int maxIndex = left;
        int max = nums[maxIndex];
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        return maxIndex;
    }

    /**
     * 递归建立二叉树
     * @param nums 数列
     * @param left 左限
     * @param right 右限
     * @return 区间内二叉树
     */
    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right || left < 0 || right >= nums.length) {
            return null;
        }

        int maxIndex = findMax(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = helper(nums, left, maxIndex - 1);
        root.right = helper(nums, maxIndex + 1, right);

        return root;
    }

    /**
     * 主过程
     * @param nums 数列
     * @return 建立二叉树
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int left = 0;
        int right = nums.length;

        return helper(nums, left, right);
    }
}
