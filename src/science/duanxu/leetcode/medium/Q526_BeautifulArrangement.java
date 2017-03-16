package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 526. Beautiful Arrangement
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q526_BeautifulArrangement {
    private int count = 0;

    private void helper(int index, boolean[] visit) {
        if (index >= visit.length) {
            count++;
        }

        for (int i = 1; i < visit.length; i++) {
            if (!visit[i] && (i % index == 0 || index % i == 0)) {
                visit[i] = true;
                helper(index+1, visit);
                visit[i] = false;
            }
        }
    }

    public int countArrangement(int N) {
        count = 0;
        helper(1, new boolean[N + 1]);

        return count;
    }
}