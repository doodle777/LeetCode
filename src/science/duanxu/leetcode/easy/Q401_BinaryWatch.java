package science.duanxu.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 401. Binary Watch
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q401_BinaryWatch {
    private void bitGenerator(int curr, int sum, int count, List<Integer> list) {
        if(sum == 0) {
            if(count == 0) {
                list.add(curr);
            }
            return;
        }

        bitGenerator(curr << 1, sum - 1, count, list);
        bitGenerator((curr << 1) + 1, sum - 1, count - 1, list);
    }

    public List<String> readBinaryWatch(int num) {
        List<String> result = new LinkedList<>();
        for (int hour = 0; hour <= num; hour++) {
            List<Integer> hours = new LinkedList<>();
            bitGenerator(0, 4, hour, hours);

            List<Integer> mins = new LinkedList<>();
            bitGenerator(0, 6, num - hour, mins);

            for (int h : hours) {
                if(h < 12) {
                    for (int m : mins) {
                        if(m < 60) {
                            result.add(String.format("%d:%02d", h, m));
                        }
                    }
                }
            }
        }

        return result;
    }
}
