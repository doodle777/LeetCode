package science.duanxu.leetcode.easy;

import java.util.*;

/**
 * 506. Relative Ranks
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q506_RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        int[] nums_copy = nums.clone();
        String[] result = new String[nums.length];
        Map<Integer, String> map = new HashMap<>();

        Arrays.sort(nums_copy);
        for(int i = nums_copy.length - 1; i >= 0; i--) {
            if (i == nums_copy.length - 1) {
                map.put(nums_copy[i], "Gold Medal");
            } else if (i == nums_copy.length - 2) {
                map.put(nums_copy[i], "Silver Medal");
            } else if (i == nums_copy.length - 3) {
                map.put(nums_copy[i], "Bronze Medal");
            } else {
                map.put(nums_copy[i], Integer.toString(nums_copy.length - i));
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
