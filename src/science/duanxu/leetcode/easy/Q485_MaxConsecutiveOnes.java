package science.duanxu.leetcode.easy;

/**
 * 485. Max Consecutive Ones
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int num : nums) {
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
