package science.duanxu.leetcode.easy;

import java.util.*;

/**
 * 414. Third Maximum Number
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                queue.add(num);
                set.add(num);
                if(queue.size() > 3) {
                    set.remove(queue.poll());
                }
            }
        }

        if (queue.size() < 3) {
            while (queue.size() > 1) {
                queue.poll();
            }
        }

        return queue.peek();
    }
}
