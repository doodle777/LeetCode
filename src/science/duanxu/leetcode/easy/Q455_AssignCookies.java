package science.duanxu.leetcode.easy;

import java.util.Arrays;

/**
 * 455. Assign Cookies
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int idxG = 0, idxS = 0;
        while (idxG < g.length && idxS < s.length) {
            if(s[idxS] >= g[idxG]) {
                idxG++;
                idxS++;
            } else {
                idxS++;
            }
        }
        return idxG;
    }
}
