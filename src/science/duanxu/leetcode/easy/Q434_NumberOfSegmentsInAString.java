package science.duanxu.leetcode.easy;

/**
 * 434. Number of Segments in a String
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if(s.trim().length() == 0) return 0;
        String[] split = s.trim().split("\\s+");
        return split.length;
    }
}
