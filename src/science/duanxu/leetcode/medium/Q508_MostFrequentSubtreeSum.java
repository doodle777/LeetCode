package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.*;

/**
 * 508. Most Frequent Subtree Sum
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q508_MostFrequentSubtreeSum {
    private int maxCount = 0;
    private Map<Integer, Integer> map = null;

    private int traverse(TreeNode root) {
        if (root == null) return 0;

        int sum = root.val + traverse(root.left) + traverse(root.right);
        int sumCount = map.getOrDefault(sum, 0);
        map.put(sum, sumCount + 1);
        maxCount = Math.max(maxCount, sumCount + 1);

        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[]{};

        map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        traverse(root);
        for (Integer i : map.keySet()) {
            if (map.get(i) == maxCount) {
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}