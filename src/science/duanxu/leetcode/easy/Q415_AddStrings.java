package science.duanxu.leetcode.easy;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * 415. Add Strings
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q415_AddStrings {
    public String addStrings(String num1, String num2) {
        return new BigInteger(num1).add(new BigInteger(num2)).toString();
    }
}
