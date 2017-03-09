package science.duanxu.leetcode.easy;

/**
 * 476. Number Complement
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q476_NumberComplement {
    public static int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public static void main(String[] args) {
        System.out.print(findComplement(5));
    }
}
