package science.duanxu.leetcode.easy;

import science.duanxu.leetcode.datastruct.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 437. Path Sum III
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q437_PathSumIII {
    private int count;
    private int sum;

    private void travelTree(TreeNode root, int s) {
        if (root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            if(s + root.val == sum) {
                count++;
                return;
            }
        }

        if (root.left != null) {
            travelTree(root.left, s + root.val);
        }

        if (root.right != null) {
            travelTree(root.right, s + root.val);
        }
    }

    public int pathSum(TreeNode root, int sum) {
        this.count = 0;
        this.sum = sum;

        travelTree(root, 0);
        return count;
    }
}
