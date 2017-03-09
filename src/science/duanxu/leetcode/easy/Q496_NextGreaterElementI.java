package science.duanxu.leetcode.easy;

import java.util.*;

/**
 * 496. Next Greater Element I
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.empty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[findNums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.getOrDefault(findNums[i], -1);
        }
        return result;
    }
}
