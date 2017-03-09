package science.duanxu.leetcode.easy;

/**
 * 167. Two Sum II - Input array is sorted
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q167_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right && (numbers[left] + numbers[right] != target)) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        int[] result = new int[2];
        result[0] = left + 1;
        result[1] = right + 1;

        return result;
    }
}
