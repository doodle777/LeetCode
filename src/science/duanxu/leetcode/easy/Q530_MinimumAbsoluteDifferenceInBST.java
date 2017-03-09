package science.duanxu.leetcode.easy;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 530. Minimum Absolute Difference in BST
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q530_MinimumAbsoluteDifferenceInBST {
    private long previous;
    private long current;
    private long minDA;

    private void travelBST(TreeNode root) {
        if(root.left != null) {
            travelBST(root.left);
        }

        current = root.val;
        if(minDA > current - previous) {
            minDA = current - previous;
        }
        previous = current;

        if(root.right != null) {
            travelBST(root.right);
        }
    }

    public int getMinimumDifference(TreeNode root) {
        previous = Integer.MIN_VALUE;
        current = 0;
        minDA = Integer.MAX_VALUE;
        travelBST(root);
        return (int)minDA;
    }
}
