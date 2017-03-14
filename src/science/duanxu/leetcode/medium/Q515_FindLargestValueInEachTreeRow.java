package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. Find Largest Value in Each Tree Row
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q515_FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.val > max) {
                    max = temp.val;
                }

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            result.add(max);
        }

        return result;
    }
}