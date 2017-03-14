package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 413. Arithmetic Slices
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q413_ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length <= 2) return 0;

        int count = 0;
        int[] B = new int[A.length - 1];
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i+1] - A[i];
        }

        int curr = B[0], cnt = 1;
        for (int i = 1; i < B.length; i++) {
            if (B[i] == curr) {
                cnt++;
            } else {
                if (cnt >= 2) {
                    count += cnt * (cnt - 1) / 2;
                }
                curr = B[i];
                cnt = 1;
            }
        }

        if (cnt >= 2) {
            count += cnt * (cnt - 1) / 2;
        }

        return count;
    }
}