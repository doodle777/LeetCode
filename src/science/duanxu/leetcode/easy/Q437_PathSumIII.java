package science.duanxu.leetcode.easy;

import science.duanxu.leetcode.datastruct.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * 437. Path Sum III
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q437_PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  //Default sum = 0 has one count
        return backtrack(root, 0, sum, map);
    }

    //BackTrack one pass
    private int backtrack(TreeNode root, int sum, int target, Map<Integer, Integer> map){
        if(root == null)
            return 0;
        sum += root.val;

        //See if there is a subarray sum equals to target
        int res = map.getOrDefault(sum - target, 0);
        map.put(sum, map.getOrDefault(sum, 0)+1);

        //Extend to left and right child
        res += backtrack(root.left, sum, target, map) + backtrack(root.right, sum, target, map);

        //Remove the current node so it wont affect other path
        map.put(sum, map.get(sum)-1);
        return res;
    }
}
