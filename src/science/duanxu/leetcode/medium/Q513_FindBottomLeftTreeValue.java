package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q513_FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode left = null;

        queue.add(root);
        while (!queue.isEmpty()) {
            left = queue.peek();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return left.val;
    }
}