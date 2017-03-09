package science.duanxu.leetcode.easy;

/**
 * 492. Construct The Rectangle
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q492_ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] ret = new int[2];

        int W = (int)Math.ceil(Math.sqrt(area));
        while(W >= 1) {
            int L = area / W;
            if(W * L == area && W <= L) {
                ret[0] = L;
                ret[1] = W;
                break;
            }
            W--;
        }

        return ret;
    }
}
