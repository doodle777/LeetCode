package science.duanxu.leetcode.easy;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.*;

/**
 * 501. Find Mode in Binary Search Tree
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q501_FindModeInBinarySearchTree {
    Integer prev = null;
    int count = 0;
    int maxCount = 0;

    private void traverse(TreeNode root, List list) {
        if (root == null) {
            return;
        }

        traverse(root.left, list);
        if (prev == null) {
            prev = root.val;
            count = 1;
        } else {
            if (prev == root.val) {
                count++;
            } else {
                count = 1;
                prev = null;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(root.val);
        } else if (count == maxCount){
            list.add(root.val);
        }
        prev = root.val;
        traverse(root.right, list);
    }

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];

        List<Integer> list = new ArrayList<>();
        traverse(root, list);

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
