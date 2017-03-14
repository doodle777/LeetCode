package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.*;

/**
 * 406. Queue Reconstruction by Height
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q406_QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0) return people;

        Arrays.sort(people, (p0, p1)->p0[0] == p1[0] ? p0[1] - p1[1] : p0[0] - p1[0]);

        int[][] result = new int[people.length][2];
        for (int[] i : result) {
            i[0] = -1;
        }
        for (int[] curr : people) {
            int count = 0, index = 0;
            while (count < curr[1] && index < people.length) {
                if (result[index][0] == -1 || result[index][0] >= curr[0]) {
                    count++;
                }
                index++;
            }

            while (index < people.length && result[index][0] != -1) {
                index++;
            }

            if (index < people.length) {
                result[index] = curr;
            }
        }

        return result;
    }
}