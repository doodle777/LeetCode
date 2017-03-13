package science.duanxu.leetcode.easy;

import java.util.List;

/**
 * 400. Nth Digit
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q400_NthDigit {
    public int findNthDigit(int n) {
        long factor = 1;
        int bitCount = 1;
        long sum = 0;

        // 确定位数
        while (sum < n) {
            sum += 9 * bitCount * factor;
            bitCount++;
            factor *= 10;
        }
        bitCount--;
        factor /= 10;
        sum -= 9 * bitCount * factor;

        // 确定是哪个数
        int left = (int)(n - sum);
        int offset = left % bitCount;
        int number = left / bitCount + (int)factor;
        if (offset == 0) {
            number--;
            offset = bitCount;
        }

        // number的offset位
        for (int i = 0; i < bitCount - offset; i++) {
            number /= 10;
        }
        return number % 10;
    }
}
