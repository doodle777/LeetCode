package science.duanxu.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 371. Sum of Two Integers
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q371_SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int sum = 0;
        int carry = 0;
        do {
            sum = a ^ b;
            carry = (a & b) << 1;

            a = sum;
            b = carry;
        } while (b != 0);

        return sum;
    }
}
